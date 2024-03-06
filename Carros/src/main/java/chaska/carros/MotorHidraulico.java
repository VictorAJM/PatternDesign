/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.carros;

/**
 *
 * @author victor
 */
public class MotorHidraulico implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Soy un motor hidraulico, porque funciono con agua :)");
    }
}
