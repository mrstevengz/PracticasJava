package models;

public class numeroPar {
    private double numero;


    public numeroPar(double numero) {
        this.numero = numero;
    }

    public void checkNumber() {
        if (this.numero % 3 == 0) {
            if (this.numero % 2 == 0) {
                System.out.println("El numero es par y es: " + this.numero);
            } else {
                System.out.println("El numero es impar y es: " + this.numero);
            }
        } else {
            System.out.println("El numero " + numero + " no es divisible por 3");
        }
    }
}
