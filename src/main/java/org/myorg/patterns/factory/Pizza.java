package org.myorg.patterns.factory;

import java.util.ArrayList;

/**
 *
 * @author Jia Lu
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("preparing " + name);
        System.out.println("adding toppings: ");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    public void cut() {
        System.out.println("cutting pizza into diagonal slices");
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
