package test;

import main.AbstractFactory;
import main.NonVeganFactory;
import main.Pizza;
import main.VeganFactory;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @org.junit.jupiter.api.Test
    void shouldCookVeganCheese() {
        AbstractFactory factory = new VeganFactory();
        Pizza pizza = new Pizza(factory);
        assertEquals("Cooking vegan cheese", pizza.cookCheese());
    }

    @org.junit.jupiter.api.Test
    void shouldCookNonVeganCheese() {
        AbstractFactory factory = new NonVeganFactory();
        Pizza pizza = new Pizza(factory);
        assertEquals("Cooking normal cheese", pizza.cookCheese());
    }

    @org.junit.jupiter.api.Test
    void shouldCookVeganTopping() {
        AbstractFactory factory = new VeganFactory();
        Pizza pizza = new Pizza(factory);
        assertEquals("Cooking vegan topping", pizza.cookTopping());
    }

    @org.junit.jupiter.api.Test
    void shouldCookNonVeganTopping() {
        AbstractFactory factory = new NonVeganFactory();
        Pizza pizza = new Pizza(factory);
        assertEquals("Cooking normal topping", pizza.cookTopping());
    }
}