package strategy.behaviors.fly.implementations;

import strategy.behaviors.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly()
    {
        System.out.println("I can't fly");
    }
}
