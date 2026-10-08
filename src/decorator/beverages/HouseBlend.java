package decorator.beverages;

import decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend()
    {
        description = "House blend";
    }

    public double getCost()
    {
        return 12;
    }
}
