package decorator;

import decorator.beverages.Espresso;
import decorator.condiments.Milk;
import decorator.condiments.Mocha;

public class StarbuzzCoffee {
    public static void main(String[] args)
    {
        Beverage myBeverage = new Espresso();
        myBeverage = new Milk(myBeverage);
        myBeverage = new Mocha(myBeverage);

        System.out.print("The order is: " + myBeverage.getDescription() + ". With price: " + myBeverage.getCost());
    }
}
