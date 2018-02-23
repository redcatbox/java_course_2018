package home.dbarannik.labs.Lab_4_Pizza;

public abstract class PizzaFactory {
    public Pizza cook() {
        addBase();
        addIngridients();
        bake();
        cut();
        pack();
        return createPizza();
    }

    protected void addBase() {
        System.out.println("Taking pizza base.");
    }

    protected abstract void addIngridients();

    protected abstract void bake();

    protected void cut() {
        System.out.println("Cutting pizza.");
    }

    protected void pack() {
        System.out.println("Packing pizza.");
    }

    protected abstract Pizza createPizza();
}
