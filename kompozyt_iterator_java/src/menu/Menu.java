/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package menu;

import Iterator.MenuIterator;
import java.util.ArrayList;
import java.util.Iterator;


public class Menu extends PizzeriaMenu {

    ArrayList<PizzeriaMenu> menuPositions = new ArrayList<PizzeriaMenu>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void add(PizzeriaMenu menuPosition) {
        menuPositions.add(menuPosition);
    }

    @Override
    public void delete(PizzeriaMenu menuPosition) {
        menuPositions.remove(menuPosition);
    }

    @Override
    public PizzeriaMenu getChildNode(int i) {
        return (PizzeriaMenu) menuPositions.get(i);
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
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());

        @SuppressWarnings("unchecked")
        Iterator<PizzeriaMenu> i = menuPositions.iterator();

        while (i.hasNext()) {
            PizzeriaMenu pizzeriaMenu = i.next();
            pizzeriaMenu.print();
        }

        System.out.println("--------------------------");
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        return new MenuIterator( menuPositions.iterator() );
    }


}
