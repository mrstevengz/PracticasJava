package EX1;

public class Gato {
    private String nombre;
    private byte edad;

    public Gato() {
        this.nombre = "Unknown";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        Gato michi = new Gato();

        System.out.println("El nombre de gato es: " + michi.getNombre());
        System.out.println("La edad del gato es: " + michi.getEdad());
    }
}
