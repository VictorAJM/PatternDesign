/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.carros;

/**
 *
 * @author victor
 */
public class CarroEspacial extends Carro {
    public CarroEspacial() {
        motor = new MotorNuclear();
    }
    @Override
    public void display() {
        
        System.out.println("Soy un carro futurista espacial");
    }
}
