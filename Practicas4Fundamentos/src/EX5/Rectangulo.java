package EX5;

public class Rectangulo {
    private double length;
    private double width;

    public Rectangulo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangulo(Rectangulo r) {
        this.length = r.length;
        this.width = r.width;
    }

    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(1.0, 2.0);
        System.out.println(rect1.length);
        System.out.println(rect1.width);

        Rectangulo rect2 = new Rectangulo(rect1);
        System.out.println(rect2.length);
        System.out.println(rect2.width);

    }
}
