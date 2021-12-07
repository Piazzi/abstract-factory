package main;

public class NonVeganCheese implements Cheese {

    @Override
    public String cook() {
        return "Cooking normal cheese";
    }
}
