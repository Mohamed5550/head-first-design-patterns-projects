package ducks.ducks;

import ducks.Duck;
import ducks.behaviors.fly.implementations.FlyWithWings;
import ducks.behaviors.quack.implementations.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display()
    {
        System.out.println("I am a read head duck!");
    }
}
