/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.carros;

/**
 *
 * @author victor
 */
public class Tesla extends Carro {
    public Tesla() {
        motor = new MotorElectrico();
    }
    @Override
    public void display() {
        System.out.println("Soy un Tesla completamente autonomo");
    }
}
