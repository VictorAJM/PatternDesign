/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.decoratorpattern;

/**
 *
 * @author victor
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "soy un dark roast";
    }
    @Override
    public double cost() {
        return 1.39;
    }
}
