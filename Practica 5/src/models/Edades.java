package models;
import java.util.Scanner;

public class Edades {
    public int size;
    public double promedio;
    Scanner scanner = new Scanner(System.in);
    int arregloEdades[];


    public void almacenarEdades(){
        System.out.println("Ingrese cuantas edades desea almacenar: ");
        size = scanner.nextInt();
    }

    public void promedioEdades() {
        arregloEdades = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese las edades");
            arregloEdades[i] = scanner.nextInt();
        }

        for (int i = 0; i < arregloEdades.length; i++){
            promedio += arregloEdades[i];
        }
        System.out.println("El promedio de edades es: " + promedio/arregloEdades.length);
    }
}