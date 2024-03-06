/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaska.hola;

/**
 *
 * @author victor
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck() {}
    
    public abstract void display();
    
    public void performFly() {
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}