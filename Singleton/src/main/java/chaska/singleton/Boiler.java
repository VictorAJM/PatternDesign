/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.singleton;

/**
 *
 * @author victor
 */
public class Boiler {
    private boolean empty;
    private boolean boiled;
    private static Boiler instance;
    private Boiler() {
        empty = true;
        boiled = false;
    }
    public static Boiler getInstance() {
        if (instance == null) {
            instance = new Boiler();
            System.out.println("Una instancia ha sido creada");
        } else {
            System.out.println("No se puede crear otra instancia");
        }
        return instance;
    }
    public void fill() {
        if (isEmpty()) {
            empty=false;
            boiled = false;
            System.out.println("Llenandose...");
        } else {
            System.out.println("Ya esta lleno :)");
        }
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("Drenandose...");
            empty=true;
            boiled=false;
        } else {
            System.out.println("No se puede vaciar :(");
        }   
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Hirviendose...");
        } else {
            System.out.println("No se puede hervir :(");
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
