package com.api.generica.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.util.Date;


@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Il nome è obbligatorio")
    @Size(min = 2, message = "Il nome deve essere più lungo di 2 caratteri")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank(message = "Il cognome è obbligatorio")
    @Size(min = 2, message = "Il nome deve essere più lungo di 2 caratteri")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotBlank(message = "Inserire una email")
    @Email(message = "Inserire una email valida")
    @Column(name = "email_address", nullable = false)
    private String email;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "created_by", nullable = true)
    @CreatedBy
    private String createdBy;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;

    @Column(name = "updated_by", nullable = true)
    @LastModifiedBy
    private String updatedBy;


  public long getId() {
        return id;
    }

  public void setId(long id) {
        this.id = id;
    }

  public String getFirstName() {
        return firstName;
    }

  public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

  public String getLastName() {
        return lastName;
    }

  public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  public String getEmail() {
        return email;
    }

  public void setEmail(String email) {
        this.email = email;
    }

  public Date getCreatedAt() {
        return createdAt;
    }

  public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

  public String getCreatedBy() {
        return createdBy;
    }

  public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

  public Date getUpdatedAt() {
        return updatedAt;
    }

  public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

  public String getUpdatedBy() {
        return updatedBy;
    }

  public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", createdBy='" + createdBy + '\'' +
                ", updatedAt=" + updatedAt +
                ", updatedby='" + updatedBy + '\'' +
                '}';
    }


}
