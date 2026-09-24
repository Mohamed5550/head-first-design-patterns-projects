package ducks.ducks;

import ducks.Duck;
import ducks.behaviors.fly.implementations.FlyNoWay;
import ducks.behaviors.quack.implementations.Squeak;

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
