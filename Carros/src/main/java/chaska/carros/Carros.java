/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chaska.carros;

/**
 *
 * @author victor
 */
public class Carros {

    public static void main(String[] args) {
        /* 
        Este codigo cumple el patron de strategy pattern porque nos permite 
        cambiar el tipo de motor de cada carro en tiempo de ejecucion
        
        Tambien nos permitiria cambiar los tipos de carro mientras se crea 
        el arreglo de carros
        
        Todos los tipos de motor implementan una interfaz general Motor
        
        Todos los tipos de carros heredan de una clase abstracta Carro
        */
        Carro[] carros = new Carro[4];
        carros[0] = new Ferrari();
        carros[1] = new Tesla();
        carros[2] = new Trailer();
        carros[3] = new CarroEspacial();
        System.out.println("Preparandonos para arrancar nuestros 4 carros:");
        System.out.println("");
        for (int i=0;i<4;i++) {
            carros[i].display();
            carros[i].arrancar();
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Vamos a agregar un nuevo tipo de motor a nuestro trailer");
        carros[2].setMotor(new MotorHidraulico());
        carros[2].display();
        carros[2].arrancar();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        // agregar 4 motores
    }
}
