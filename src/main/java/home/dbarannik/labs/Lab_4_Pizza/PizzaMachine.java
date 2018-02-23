package home.dbarannik.labs.Lab_4_Pizza;

public class PizzaMachine {
    PizzaMakerFactory pizzaMakerFactory;

    public PizzaMachine(PizzaMakerFactory pizzaMakerFactory) {
        this.pizzaMakerFactory = pizzaMakerFactory;
    }

    public Pizza order(Button button) {
        PizzaMaker pizzaMaker = pizzaMakerFactory.getPizzaMaker(button);
        return pizzaMaker.cook();
    }

    public static void main(String[] args) {
        Pizza pizza;
        pizza = new PizzaMachine(new ItalianPizzaMakerFactory()).order(Button.ONE);
        pizza = new PizzaMachine(new ItalianPizzaMakerFactory()).order(Button.TWO);

    }
}
