package home.dbarannik.labs.Lab_4_Pizza;

public class ItalianPizzaMakerFactory implements PizzaMakerFactory {
    PizzaMaker pizzaMaker = null;

    public PizzaMaker getPizzaMaker(Button button) {
        PizzaMaker factory = null;
        switch (button) {
            case ONE:
                return factory = new PolloPizzaMaker();
            case TWO:
                return factory = new PepperonniPizzaMaker();
            default:
                return null;
        }
    }
}
