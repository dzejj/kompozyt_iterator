/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package waiters;

import java.util.Iterator;
import menu.PizzeriaMenu;


public class IteratorWaiter {

    PizzeriaMenu pizzeriaMenu;

    public IteratorWaiter(PizzeriaMenu pizzeriaMenu) {
        this.pizzeriaMenu = pizzeriaMenu;
    }

    public void printMenu() {
         Iterator iterator = pizzeriaMenu.iterator();


         while ( iterator.hasNext() ) {

             PizzeriaMenu temp = (PizzeriaMenu) iterator.next();

             try {
                temp.print(); 

             } catch (UnsupportedOperationException e) {}
         }

    }

    public void printWegetarianMenu() {
        
          Iterator iterator = pizzeriaMenu.iterator();


         while ( iterator.hasNext() ) {

             PizzeriaMenu temp = (PizzeriaMenu) iterator.next();

             try {
                 if (temp.isWegetarian())
                        temp.print();

             } catch (UnsupportedOperationException e) {}
         }
    }

}
