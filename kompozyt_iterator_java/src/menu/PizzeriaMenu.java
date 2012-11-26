/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package menu;

import java.util.Iterator;


public abstract class PizzeriaMenu {

    public void add(PizzeriaMenu pizzeriaMenu) {
        throw new UnsupportedOperationException();
    }

    public void delete(PizzeriaMenu pizzeriaMenu) {
        throw new UnsupportedOperationException();
    }

    public PizzeriaMenu getChildNode(int i) {
        throw new UnsupportedOperationException();
    }



    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isWegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }



    public Iterator iterator() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
