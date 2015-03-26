/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jl.patterns.factory;

/**
 * HEAD First Design Pattern
 *
 * @author Jia Lu
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("Clam");
        System.out.println("Ethan ordered a " + pizza.getName());

        System.out.println("Joel ordered a " + nyStore.orderPizza("cheese").getName());
    }
}
