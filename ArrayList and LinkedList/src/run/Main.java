package run;

import models.Gato;
import models.Perro;
import models.Refugio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Refugio refugio = new Refugio();
        Scanner sc = new Scanner(System.in);

        int op;
        int idCounter = 1;

        do {
            System.out.println("----Menu Refugio----");
            System.out.println("1. Agregar Perro");
            System.out.println("2. Agregar Gato");
            System.out.println("3. Listar animales disponibles para adopcion");
            System.out.println("4. Listar historial de animales");
            System.out.println("5. Adoptar un animal");
            System.out.println("6. Salir");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Nombre del perro: ");
                    String nombrePerro = sc.nextLine();
                    System.out.println("Raza: ");
                    String raza = sc.nextLine();
                    System.out.println("Edad: ");
                    byte edad = sc.nextByte();
                    sc.nextLine();

                    refugio.agregarAnimal(new Perro(idCounter++, nombrePerro, raza, edad));
                    break;

                case 2:
                    System.out.println("Nombre del gato: ");
                    String nombreGato = sc.nextLine();
                    System.out.println("Color del gato: ");
                    String colorGato = sc.nextLine();
                    System.out.println("Edad: ");
                    byte edadGato = sc.nextByte();
                    sc.nextLine();

                    refugio.agregarAnimal(new Gato(idCounter++, nombreGato, colorGato, edadGato));
                    break;

                case 3:
                    refugio.animalesDisponibles();
                    break;

                case 4:
                    refugio.listarHistorial();
                    break;

                case 5:
                    System.out.println("Ingrese el ID del animal que desea adoptar: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    refugio.adoptarAnimal(id);
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida....");
            }
        } while (op != 6);

        sc.close();
    }
}
