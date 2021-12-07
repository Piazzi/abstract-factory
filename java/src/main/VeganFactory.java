package main;

public class VeganFactory implements AbstractFactory{
    @Override
    public Cheese addCheese() {
        return new VeganCheese();
    }

    @Override
    public Topping addTopping() {
        return new VeganTopping();
    }
}
