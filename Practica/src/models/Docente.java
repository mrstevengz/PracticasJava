package models;

public class Docente {
    private String name;

    public Docente(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
