package decorator.condiments;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription() + ", Milk";
    }

    public double getCost()
    {
        return 2.5;
    }

}
