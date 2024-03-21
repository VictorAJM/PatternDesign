/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.command;

/**
 *
 * @author victor
 */
public class GarageDoorUpCommand implements Commandp {
    GarageDoor garageDoor;
    int prev;
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
        prev = 1;
    }
    @Override 
    public void undo() {
        if (prev == 0) {
            garageDoor.down();
        } else {
            garageDoor.up();
        }
    }
}