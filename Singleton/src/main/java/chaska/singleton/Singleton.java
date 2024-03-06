/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chaska.singleton;

/**
 *
 * @author victor
 */
public class Singleton {

    public static void main(String[] args) {
        Boiler boiler = Boiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        System.out.println("El primer instancia se realiza correctamente...\n");
        Boiler _boiler = Boiler.getInstance();
        _boiler.boil();
        _boiler.fill();
        
        boiler.boil();
        System.out.println("La segunda instancia funciona correctamente\ntiene sincronia con la 1ra");
        _boiler.fill();
        _boiler.drain();
        System.out.println("El patron funciona correctamente\n");
    }
}
