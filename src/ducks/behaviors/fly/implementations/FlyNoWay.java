package ducks.behaviors.fly.implementations;

import ducks.behaviors.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly()
    {
        System.out.println("I can't fly");
    }
}
