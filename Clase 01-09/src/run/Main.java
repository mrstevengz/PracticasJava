package run;

import models.Person;

public class Main {
    public static void main(String[] args) {
        Person persona =  new Person();
        persona.firstName = "Steven";
        System.out.println(persona.firstName);
    }
}