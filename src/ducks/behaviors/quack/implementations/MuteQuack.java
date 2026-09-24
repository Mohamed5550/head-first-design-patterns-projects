package ducks.behaviors.quack.implementations;

import ducks.behaviors.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack()
    {
        System.out.println("<< Silence >>");
    }
}
