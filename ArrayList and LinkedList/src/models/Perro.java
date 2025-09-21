package models;

public class Perro extends Animal {

    //Encapsulamiento
    private String raza;
    private byte edad;

    public Perro(int id, String nombre, String raza, byte edad) {
        super(id, nombre, raza);
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void animalInfo() {
        System.out.println("🐕 Perro [ID: " + getId() + ", Nombre: " + getNombre() + ", Raza: " + getRaza() + ", Edad: " + getEdad()  + "]");
    }
}
