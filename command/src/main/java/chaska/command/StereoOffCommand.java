/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.command;

/**
 *
 * @author victor
 */
public class StereoOffCommand implements Commandp {
    Stereo stereo;
    int prev;
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.off();
        prev = 0;
    }
    @Override 
    public void undo() {
        if (prev == 1) {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        } else {
            stereo.off();
        }
    }
}
