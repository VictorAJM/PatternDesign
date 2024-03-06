/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.factorypattern;

/**
 *
 * @author victor
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
      Pizza pizza;
      pizza = createPizza(type);
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
      
      return pizza;
    }
    abstract Pizza createPizza(String type);
}
