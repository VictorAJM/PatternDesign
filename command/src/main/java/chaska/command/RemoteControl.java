/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.command;

/**
 *
 * @author victor
 */
public class RemoteControl {
    Commandp[] onCommands;
    Commandp[] offCommands;
    Commandp undoCommand;
    public static final int SIZE = 3;
    public RemoteControl() {
        onCommands = new Commandp[SIZE];
        offCommands = new Commandp[SIZE];
 
        Commandp noCommand = new NoCommand();
        for (int i = 0; i < SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
  
    public void setCommand(int slot, Commandp onCommand, Commandp offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
 
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
 
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
    @Override
    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("    ").append(offCommands[i].getClass().getName()).append("\n");
        }
        stringBuff.append("[undo] ").append(undoCommand.getClass().getName()).append("\n");
        return stringBuff.toString();
    }
}