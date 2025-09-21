package models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Refugio {
    //Arraylist para almacenar historial de todos los animales
    private List<Animal> historial = new ArrayList<>();

    //Linkedlist para almacenar animales actualmente disponibles
    private LinkedList<Animal> disponibles = new LinkedList<>();


    //Funcion para agregar un animal al refugio (Se agrega al Array y Linked List)
    public void agregarAnimal(Animal animal) {
        historial.add(animal);
        disponibles.add(animal);
        System.out.println("Animal agregado al refugio");
    }

    //Funcion para iterar sobre cada animal en la LinkedList
    public void animalesDisponibles() {
        if (disponibles.isEmpty()) {
            System.out.println("No hay animales disponibles para adopcion");
        } else  {
            for (Animal a : disponibles) {
                a.animalInfo();
            }
        }
    }

    //Funcion para iterar sobre cada animal en el Arraylist (todos los animales agregados al sistema)
    public void listarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay animales en el historial");
        } else {
            for (Animal a : historial) {
                a.animalInfo();
            }
        }
    }

    //Funcion delete (adoptar) para borrar el animal de la LinkedList disponibles. No se elimina del Arraylist historial
    public void adoptarAnimal(int id) {
        Animal found = null;
        for (Animal a : disponibles) {
            if (a.getId() == id) {
                found = a;
                break;
            }
        }
            if (found != null) {
                disponibles.remove(found);
                System.out.println("El animal con ID: " + id + " fue adoptado.");
            } else {
                System.out.println("No se encontro un animal con ese ID");
            }
        }

    }
