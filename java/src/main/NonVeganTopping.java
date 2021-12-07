package main;

public class NonVeganTopping implements Topping {

    @Override
    public String cook() {
        return "Cooking normal topping";
    }
}
