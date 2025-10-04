package EX2;

public class Perro {
    private String nombre;
    private String color;

    public Perro(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public static void main(String[] args) {
        Perro duke = new Perro("Duke", "Beagle");
        System.out.println(duke.nombre);
        System.out.println(duke.color);
    }
}
