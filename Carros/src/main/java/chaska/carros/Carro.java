/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chaska.carros;

/**
 *
 * @author victor
 */
public abstract class Carro {
    Motor motor;
    public Carro() {}
    public abstract void display();
    public void arrancar() {
        motor.arrancar();
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
