/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chaska.factorypattern;

/**
 *
 * @author victor
 */
public class FactoryPattern {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+ "\n");
        System.out.println(pizza.toString()+"\n\n\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza.getName()+ "\n");
        System.out.println(pizza.toString()+"\n\n\n");
    }
}
