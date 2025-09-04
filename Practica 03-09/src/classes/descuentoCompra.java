package classes;

public class descuentoCompra {
    public double descuento;
    public double cantidad;

    public void descuentoAplicar() {
        if (cantidad >= 250)
        {
            cantidad = (0.10 * cantidad) + cantidad;
            System.out.println("Descuento aplicado. Su total es: " + cantidad);
        }
            else {
                System.out.println("Su total es: " + cantidad);
            }
        }


}
