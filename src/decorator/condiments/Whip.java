package decorator.condiments;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription() + ", Whip";
    }

    public double getCost()
    {
        return 3;
    }

}
