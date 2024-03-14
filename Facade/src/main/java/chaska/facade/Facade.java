/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chaska.facade;

/**
 *
 * @author victor
 */
public class Facade {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplifier");
        PopcornPopper popper = new PopcornPopper("popper");
        Screen screen = new Screen("screen");
        TheaterLights lights = new TheaterLights("lights");
        StreamingPlayer player = new StreamingPlayer("player");
        Projector projector = new Projector("projector");
        HomeTheaterFacade htf = new HomeTheaterFacade(amp,player,projector,lights,screen,popper);
        htf.watchMovie("Avengers infity war");
        htf.endMovie();
    }
}
