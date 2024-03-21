/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.command;

/**
 *
 * @author victor
 */
public class CeilingFanOffCommand implements Commandp {
    CeilingFan ceilingFan;
    int prev;
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
        prev = ceilingFan.getSpeed();
    }
    @Override
    public void execute() {
        ceilingFan.off();
    }
    @Override
    public void undo() {
        if (prev == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prev == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}

