package strategy.ducks;

import strategy.Duck;
import strategy.behaviors.fly.implementations.FlyWithWings;
import strategy.behaviors.quack.implementations.Quack;

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
