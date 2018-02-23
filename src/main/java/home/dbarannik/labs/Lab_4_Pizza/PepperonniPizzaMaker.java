package home.dbarannik.labs.Lab_4_Pizza;

public class PepperonniPizzaMaker extends PizzaMaker {
    @Override
    protected void addIngridients() {
        System.out.println("Adding pepperonni, cheese...");
    }

    @Override
    protected void bake() {
        System.out.println("Baking pizza...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
    }

    @Override
    protected Pizza createPizza() {
        return new Pizza("Pepperonni");
    }
}
