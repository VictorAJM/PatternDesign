/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.decoratorpattern;

/**
 *
 * @author victor
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "soy un expresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}