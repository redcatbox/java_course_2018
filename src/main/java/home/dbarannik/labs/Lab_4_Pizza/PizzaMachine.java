package home.dbarannik.labs.Lab_4_Pizza;

public class PizzaMachine {
    public static void main(String[] args) {
        getOrder(Button.ONE);
        getOrder(Button.TWO);
    }

    public static void getOrder(Button button) {
        PizzaFactory factory = null;
        switch (button) {
            case ONE:
                factory = new PolloPizzaMaker();
                break;
            case TWO:
                factory = new PepperonniPizzaMaker();
                break;
        }
        factory.cook();
    }
}
