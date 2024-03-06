/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.carros;

/**
 *
 * @author victor
 */
public class Trailer extends Carro {
    public Trailer() {
        motor = new MotorDiesel();
    }
    @Override
    public void display() {
        System.out.println("Soy un trailer, tambien soy un carro");
    }
}
