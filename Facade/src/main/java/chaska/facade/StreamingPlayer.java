/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.facade;

/**
 *
 * @author victor
 */
public class StreamingPlayer {
    String description;
    String movie;

    public StreamingPlayer(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println(description + " playing \"" + movie + "\"");
    }
    public void stop() {
        System.out.println(description + " stopped \"" + movie + "\"");
    }
    @Override
    public String toString() {
        return description;
    }
}
