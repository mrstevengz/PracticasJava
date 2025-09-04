package run;

import models.estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //psvm
        System.out.println("Universidad Americana"); // sout

        int edad = 18;
        float promedio = 100.00f; //Variables float se agrega f
        System.out.println("La edad es " + edad);
        System.out.println("La nota promedio es " + promedio);

        Scanner input = new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese el nombre:");
        nombre = input.nextLine();

        System.out.println("El nombre dado es: " + nombre);


        //Metodo de constructor y get/set
        estudiante Steven = new estudiante();
        Steven.setNombre("Steven");
        Steven.setApellidos("Sequeira");
        Steven.setCarrera("Ing. en Sistemas");
        Steven.setNota(9000.5f);

        /*System.out.println("La nota es: " + Steven.getNota());
        System.out.println("La nota promedio es: " + Steven.getNota());
        System.out.println("La nota promedio de" + Steven.getNombre() + " es: " + Steven.getNota()); */

        System.out.println(Steven);


    }
}