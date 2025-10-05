package EX8;

import java.util.ArrayList;

public class Classroom {
    private String className;
    private ArrayList<String> students = new ArrayList<>();

    public Classroom(String className, ArrayList<String> students) {
        this.className = className;
        this.students = students;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Classroom{");
        sb.append("className='").append(className).append('\'');
        sb.append(", students=").append(students);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Steven Sequeira");
        students.add("Juanito Sequeira");
        Classroom clase1 = new Classroom("Clase 5B", students);

        System.out.println(clase1);
    }

}
