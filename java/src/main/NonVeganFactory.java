package main;

public class NonVeganFactory implements AbstractFactory{

    @Override
    public Cheese addCheese() {
        return new NonVeganCheese();
    }

    @Override
    public Topping addTopping() {
        return new NonVeganTopping();
    }
}
