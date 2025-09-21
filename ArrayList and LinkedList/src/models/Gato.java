package models;

public class Gato extends Animal {
    private String color;
    private byte edad;

    public Gato(int id, String nombre, String color, byte edad) {
        super(id, nombre,color);
        this.color = color;
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void animalInfo() {
        System.out.println("🐈 Gato [ID: " + getId() + ", Nombre: " + getNombre() + ", Color: " + getColor() + ", Edad: " + getEdad()  + "]");
    }
}
