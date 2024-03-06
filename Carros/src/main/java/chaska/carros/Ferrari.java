/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.carros;

/**
 *
 * @author victor
 */
public class Ferrari extends Carro {
    public Ferrari() {
        motor = new MotorGasolina();
    }
    @Override 
    public void display() {
        System.out.println("Soy un ferrari fiuuum");
    }
}
