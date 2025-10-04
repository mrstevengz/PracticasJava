package EX3;

public class Libro {
    private String titulo;
    private String autor;
    private float precio;

    public Libro() {
        this.titulo = "Hola";
        this.autor = "Ruben Dario";
        this.precio = 0.0F;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = 0.0F;
    }

    public Libro(String titulo, String autor, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
}
