/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.command;

/**
 *
 * @author victor
 */
public class GarageDoorDownCommand implements Commandp {
    GarageDoor garageDoor;
    int prev;
    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.down();
        prev = 0;
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