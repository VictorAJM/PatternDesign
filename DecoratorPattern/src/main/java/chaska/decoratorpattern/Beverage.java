/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.decoratorpattern;

/**
 *
 * @author victor
 */
public abstract class Beverage {
    String description = "Bebida desconocida";
    public String getDescription() {
        return description;
    }
    // metodo a decorar
    public abstract double cost();
}
