package EX7;

public class Auto {
    private String marca;
    private String modelo;
    private int año;

    public Auto(String marca, String modelo, int año) {
        this.marca = (marca == null || marca.isEmpty()) ? "Marca desconocida" : marca;
        this.modelo = (marca == null || marca.isEmpty()) ? "Modelo desconocido" : modelo;
        this.año = (año <= 0) ? 2000 : año;
    }

    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "RAV4", 2025);
        Auto auto2 = new Auto("", "", -15);


        System.out.println("----Carro 1----");
        System.out.println("Marca: " + auto.marca);
        System.out.println("Modelo: " + auto.modelo);
        System.out.println("Año: " + auto.año);

        System.out.println("----Carro 2----");
        System.out.println("Marca: " + auto2.marca);
        System.out.println("Modelo: " + auto2.modelo);
        System.out.println("Año: " + auto2.año);
    }
}
