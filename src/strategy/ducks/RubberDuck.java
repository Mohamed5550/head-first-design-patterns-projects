package strategy.ducks;

import strategy.Duck;
import strategy.behaviors.fly.implementations.FlyNoWay;
import strategy.behaviors.quack.implementations.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display()
    {
        System.out.println("I am a rubber duck!");
    }
}
