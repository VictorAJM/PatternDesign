/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.command;

/**
 *
 * @author victor
 */
public class GarageDoor {

    public GarageDoor() {
    }

    public void up() {
        System.out.println("Garage Door Open");
    }

    public void down() {
        System.out.println("Garage Door Closed");
    }

    public void stop() {
        System.out.println("Garage Door Stopped");
    }

    public void lightOn() {
        System.out.println("Garage light on");
    }

    public void lightOff() {
        System.out.println("Garage light off");
    }
}