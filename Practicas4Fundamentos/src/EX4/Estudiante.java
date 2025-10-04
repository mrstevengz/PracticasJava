package EX4;

public class Estudiante {
    private int studentID;
    private String studentName;
    private double grade;

    public Estudiante() {
        this.studentID = 0;
        this.studentName = "";
        this.grade = 0.0;
    }

    public Estudiante(int studentID, String studentName, double grade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante(24010446, "Steven Sequeira", 99.9);

        System.out.println("-----Estudiante 1-----");
        System.out.println("CIF: " + estudiante1.studentID);
        System.out.println("Nombre: " + estudiante1.studentName);
        System.out.println("Nota: " + estudiante1.grade);

        System.out.println("------Estudiante 2------");
        System.out.println("CIF: " + estudiante2.studentID);
        System.out.println("Nombre: " + estudiante2.studentName);
        System.out.println("Nota: " + estudiante2.grade);
    }
}
