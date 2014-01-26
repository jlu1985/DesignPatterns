package org.myorg.patterns.factory;

/**
 *
 * @author jlu
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "Thin Curst Dough";
        sauce = "Marinar Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

}
