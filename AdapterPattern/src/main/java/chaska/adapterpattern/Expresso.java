/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.adapterpattern;

/**
 *
 * @author victor
 */
public class Expresso extends Beverage {
    public Expresso() {
        description = "soy un expresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
