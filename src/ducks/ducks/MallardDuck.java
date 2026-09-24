package ducks.ducks;

import ducks.Duck;
import ducks.behaviors.fly.implementations.FlyWithWings;
import ducks.behaviors.quack.implementations.Quack;

public class MallardDuck extends Duck {

    public MallardDuck()
    {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display()
    {
        System.out.println("I'm a real Mallard duck");
    }
}
