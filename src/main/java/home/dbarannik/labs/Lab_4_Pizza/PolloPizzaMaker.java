package home.dbarannik.labs.Lab_4_Pizza;

public class PolloPizzaMaker extends PizzaFactory {
    @Override
    protected void addIngridients() {
        System.out.println("Adding chicken, cheese...");
    }

    @Override
    protected void bake() {
        System.out.println("Baking pizza...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
    }

    @Override
    protected Pizza createPizza() {
        return new Pizza("Pollo");
    }
}
