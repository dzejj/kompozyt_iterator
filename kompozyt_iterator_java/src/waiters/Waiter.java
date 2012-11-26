/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package waiters;

import menu.PizzeriaMenu;

/**
 *
 * @author daniel
 */
public class Waiter {


    PizzeriaMenu pizzeriaMenu;

    public Waiter(PizzeriaMenu pizzeriaMenu) {
        this.pizzeriaMenu = pizzeriaMenu;
    }

    public void printMenu() {
        pizzeriaMenu.print();
    }

}
