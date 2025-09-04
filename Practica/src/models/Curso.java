package models;

public class Curso {
    private String name;
    private Docente docente;

    public Curso(String name, Docente docente) {
        this.name = name;
        this.docente = docente;
    }

    @Override
    public String toString() {
        return name + " - " + docente;
    }
}
