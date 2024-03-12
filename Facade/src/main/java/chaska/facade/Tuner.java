/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.facade;

/**
 *
 * @author victor
 */
public class Tuner {
    String description;

    public Tuner(String description) {
            this.description = description;
    }
    @Override
    public String toString() {
        return description;
    }
}
