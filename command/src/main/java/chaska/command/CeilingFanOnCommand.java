/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.command;

/**
 *
 * @author victor
 */
public class CeilingFanOnCommand implements Commandp {
    CeilingFan ceilingFan;
    int prev;
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.high();
        prev = ceilingFan.HIGH;
    }
    @Override
    public void undo() {
        if (prev == ceilingFan.OFF) {
            ceilingFan.off();
        } else {
            ceilingFan.high();
        }
    }
}

