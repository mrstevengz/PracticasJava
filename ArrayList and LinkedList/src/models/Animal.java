package models;

//Clase abstracta de animal
public abstract class Animal {

    //Encapsulamiento
    private int id;
    private String nombre;

    //Constructor
    public Animal(int id, String nombre, String raza) {
        this.id = id;
        this.nombre = nombre;
    }

    //Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void animalInfo();
}
