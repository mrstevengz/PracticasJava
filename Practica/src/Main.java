import models.Docente;
import models.Curso;

public class Main {
    public static void main(String[] args) {
        Docente doc = new Docente("67");
        Curso curso = new Curso("Sistemas",  doc);
        System.out.println(curso);
    }
}
