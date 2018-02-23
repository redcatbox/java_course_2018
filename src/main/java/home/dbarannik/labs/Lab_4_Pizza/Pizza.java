package home.dbarannik.labs.Lab_4_Pizza;

import java.util.Date;

public class Pizza {
    private final String name;
    private boolean eaten;

    public void eatPizza() {
        if (eaten) {
            return;
        }
        eaten = true;
        System.out.printf("Pizza %s is eaten", name);
    }

    public Pizza(String name) {
        this.name = name;
        System.out.println(this.name);
    }
}
