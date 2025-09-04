package models;
import java.util.Scanner;

public class Numeros {

    public int x;
    int[] arregloNumeros;

    public void leerNumeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros desea almacenar: ");
        x = teclado.nextInt();
        arregloNumeros = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Ingrese los numeros: ");
            arregloNumeros[i] = teclado.nextInt();
        }

        System.out.println("Sus numeros en orden inverso al ingreso son:");
        for (int i = arregloNumeros.length - 1; i >= 0; i--) {
            System.out.print(arregloNumeros[i] + " ");
        }
    }
}
