package strategy.behaviors.quack.implementations;

import strategy.behaviors.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack()
    {
        System.out.println("<< Silence >>");
    }
}
