/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package menu;

import Iterator.EmptyIterator;
import java.util.Iterator;


public class MenuPosition extends PizzeriaMenu {

    String name;
    String description;
    boolean wegetarian;
    double price;

    public MenuPosition(String name, String description, boolean wegetarian, double price) {

        this.name = name;
        this.description = description;
        this.wegetarian = wegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isWegetarian() {
        return wegetarian;
    }

    @Override
    public void print() {

        System.out.print("  " + getName());

        if (isWegetarian())
            System.out.print("[W]");

        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }

    public Iterator iterator() {
        return new EmptyIterator();
    }
}
