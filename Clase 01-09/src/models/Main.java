package models;

public class Main {
    public static void main(String[] args) {
        Person persona = new Person();
        persona.firstName = "Steven";
        persona.lastName = "Sequeira";
        persona.country = "Nicaragua";
        persona.setCity("Managua");
        System.out.println(persona.firstName);
        System.out.println(persona.lastName);
        System.out.println(persona.country);

        System.out.println(persona.toString());
    }
}
