package com.api.generica.controller;

import com.api.generica.exception.ResourceNotFoundException;
import com.api.generica.model.User;
import com.api.generica.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/crud")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  // Mostra tutti gli utenti
  @GetMapping("/user")
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  // mostra utente da id

  @GetMapping("/user/{id}")
  public ResponseEntity<User> getUsersById(@PathVariable(value = "id") Long userId)
      throws ResourceNotFoundException {
    User user = userRepository
        .findById(userId)
        .orElseThrow(() -> new ResourceNotFoundException("Utente non trovato :: " + userId));
    return ResponseEntity.ok().body(user);
  }

  // crea user

  @PostMapping("/user")
  public User createUser(@Valid @RequestBody User user) {
    try {
      return userRepository.save(user);
    } catch (DataIntegrityViolationException e) {
      throw new ResponseStatusException(HttpStatus.CONFLICT, "Questa email è già presente nel database");
    }
  }


  @PutMapping("/user/{id}")
  public ResponseEntity<User> updateUser(
      @PathVariable(value = "id") Long userId, @Valid @RequestBody User userDetails)
      throws ResourceNotFoundException {

    User user = userRepository
        .findById(userId)
        .orElseThrow(() -> new ResourceNotFoundException("Utente non trovato :: " + userId));

    user.setEmail(userDetails.getEmail());
    user.setLastName(userDetails.getLastName());
    user.setFirstName(userDetails.getFirstName());
    user.setUpdatedAt(new Date());
    final User updatedUser = userRepository.save(user);
    return ResponseEntity.ok(updatedUser);
  }

  @PatchMapping("/user/{id}")
  public ResponseEntity<User> patchUser(
      @PathVariable(value="id") Long userId, @Valid @RequestBody Map<String, Object> userDetails)
      throws ResourceNotFoundException {
  
      User user = userRepository
          .findById(userId)
          .orElseThrow(() -> new ResourceNotFoundException("Utente non trovato :: " + userId));
  
      if (userDetails.containsKey("email")) {
          user.setEmail((String) userDetails.get("email"));
      }
      if (userDetails.containsKey("lastName")) {
          user.setLastName((String) userDetails.get("lastName"));
      }
      if (userDetails.containsKey("firstName")) {
          user.setFirstName((String) userDetails.get("firstName"));
      }
      user.setUpdatedAt(new Date());
      final User updatedUser = userRepository.save(user);
      return ResponseEntity.ok(updatedUser);
  }

  @DeleteMapping("/user/{id}")
  public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId) throws Exception {
    User user = userRepository
        .findById(userId)
        .orElseThrow(() -> new ResourceNotFoundException("Utente non trovato :: " + userId));

    userRepository.delete(user);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return response;
  }
}