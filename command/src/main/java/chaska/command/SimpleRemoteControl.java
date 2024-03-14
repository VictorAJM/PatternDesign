/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.command;

/**
 *
 * @author victor
 */
public class SimpleRemoteControl {
    Commandp slot;
    public SimpleRemoteControl() {}
    public void setCommand(Commandp command) {
        slot = command;
    }
    public void buttonWasPressed() {
        slot.execute();
    }
}
