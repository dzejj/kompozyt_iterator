/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wizytator_java;

import menu.Menu;
import menu.MenuPosition;
import menu.PizzeriaMenu;
import waiters.IteratorWaiter;

public class Main {

    
    public static void main(String[] args) {

        //-----------SImple create Menu
        PizzeriaMenu pizzasMenu = new Menu("PIZZE","Najlepsze pizze w Twoim mie�cie!");
        PizzeriaMenu drinksMenu = new Menu("NAPOJE","Szeroka gama artyku��w ch�odz�cych do wyboru;p");
        PizzeriaMenu sweetsMenu = new Menu("DESERY","Czyli wszystko na s�odko");

        PizzeriaMenu mainMenu = new Menu("MENU PIZZERII", "Pe�na oferta lokalu");

        mainMenu.add(pizzasMenu);
        mainMenu.add(drinksMenu);
        mainMenu.add(sweetsMenu);

        //some pizzas
        pizzasMenu.add(new MenuPosition("Margeritha","sos pomidorowy, ser mozzarella", true, 19.90));
        pizzasMenu.add(new MenuPosition("Capriciosa","sos pomidorowy, ser mozzarella, szynka, pieczarki", false, 25.90));
        pizzasMenu.add(new MenuPosition("Hawaian","sos pomidorowy, ser mozzarella, szynka, ananas", false, 27.90));
        pizzasMenu.add(new MenuPosition("Pepperoni","sos pomidorowy, ser mozzarella, kiełbasa pepperoni", false, 27.90));
        pizzasMenu.add(new MenuPosition("Vegetariana","sos pomidorowy, ser mozzarella, pieczarki, papryka, kukurydza, cebula, pomidor", true, 31.90));


        //some drinks
        drinksMenu.add(new MenuPosition("CocaCola","Najpopularniejszy nap�j", false, 3.90));
        drinksMenu.add(new MenuPosition("Tonic","Specyficzny i bardzo dobry nap�j ch�odz�cy", false, 25.90));

        //some sweets
        sweetsMenu.add(new MenuPosition("P�czek","klasyczny p�czek z d�emem", false, 1.40));
        sweetsMenu.add(new MenuPosition("Tiramisu","Popularne ciastko", false, 3.70));


        IteratorWaiter waiter = new IteratorWaiter(mainMenu);
        waiter.printMenu();

        System.out.println("\n\nA teraz pizze wegetaria�skie =================================================!!");
        waiter.printWegetarianMenu();

        //-----------------------------------------------------------------------------------------------

        

    }

}
