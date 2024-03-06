/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chaska.hola;

/**
 *
 * @author victor
 */

public class Hola {

    public static void main(String[] args) {
        DecoyDuck[] decoyDucks = new DecoyDuck[5];
        MallardDuck[] mallardDucks = new MallardDuck[5];
        ModelDuck[] modelDucks = new ModelDuck[5];
        RubberDuck[] rubberDucks = new RubberDuck[5];
        for (int i=0;i<5;i++) {
            decoyDucks[i]= new DecoyDuck();
            mallardDucks[i]= new MallardDuck();
            modelDucks[i]= new ModelDuck();
            rubberDucks[i] = new RubberDuck();
        }
        for (int i=0;i<5;i++) {
            decoyDucks[i].performFly(); decoyDucks[i].performQuack();
            mallardDucks[i].performFly(); mallardDucks[i].performQuack();
            modelDucks[i].performFly(); modelDucks[i].performQuack();
            rubberDucks[i].performFly(); rubberDucks[i].performQuack();
        }
        for (int i=0;i<5;i++) {
            decoyDucks[i].setFlyBehavior(new FlyNoWay());
            decoyDucks[i].setQuackBehavior(new MuteQuack());
            mallardDucks[i].setFlyBehavior(new FlyNoWay());
            mallardDucks[i].setQuackBehavior(new MuteQuack());
            modelDucks[i].setFlyBehavior(new FlyNoWay());
            modelDucks[i].setQuackBehavior(new MuteQuack());
            rubberDucks[i].setFlyBehavior(new FlyNoWay());
            rubberDucks[i].setQuackBehavior(new MuteQuack());
        }
    }
    
}
