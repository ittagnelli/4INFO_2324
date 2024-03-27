package com.tools_log;

public class Login <T> {
    private Ricerca find;
    private int userLevel;
    private T utente;

    public Login(String pathFolder, int userLevel) {
        find = new Ricerca(pathFolder, userLevel);
        this.userLevel = userLevel;
    }

    @SuppressWarnings("unchecked") // sopprimere o ignorare gli avvisi provenienti dal compilatore
    public boolean log(String username, String password) {
        if(userLevel == 0) utente = (T)find.getAdmin(username, password);
        else if(userLevel == 1) utente = (T)find.getDocente(username, password);
        else if(userLevel == 2) utente = (T)find.getStudente(username, password);
        return utente != null;
    }

    public T getPerson() {
        return utente;
    }
}