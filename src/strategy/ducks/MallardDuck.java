package strategy.ducks;

import strategy.Duck;
import strategy.behaviors.fly.implementations.FlyWithWings;
import strategy.behaviors.quack.implementations.Quack;

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
