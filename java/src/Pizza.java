public class Pizza {

    private String name;
    private int size;
    Cheese cheese;
    Topping topping;

    public Pizza (AbstractFactory factory) {
        this.cheese = factory.addCheese();
        this.topping = factory.addTopping();
    }

    public String cookCheese(){
        return this.cheese.cook();
    }

    public String cookTopping() {
        return this.topping.cook();
    }
}

