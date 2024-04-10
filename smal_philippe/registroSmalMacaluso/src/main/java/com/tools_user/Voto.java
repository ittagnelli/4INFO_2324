package com.tools_user;

public class Voto {
    private float voto;
    private String materia;
    private final String SEPARATOR_VOTO = "-";
    
    public Voto(float voto, String materia) {
    	this.voto = voto;
    	this.materia = materia;
    }

    public Voto(String line) {
        String[] lsLine = StringToArray(line);
        this.voto = Float.valueOf(lsLine[1]);
        this.materia = lsLine[0];
    }

    private String[] StringToArray(String line) {
        return line.split(SEPARATOR_VOTO);
    }

    public String getMateria() {
    	return materia;
    }

    public float getVoto() {
        return voto;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setVoto(float voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return ((voto % 1) == 0) ? String.valueOf((int)voto) : String.valueOf(voto);
    }
}
