
package Iterator;

import java.util.Iterator;
import java.util.Stack;
import menu.Menu;
import menu.PizzeriaMenu;


public class MenuIterator implements Iterator {
    Stack stack = new Stack();
 
  
    @SuppressWarnings("unchecked")
    public MenuIterator(Iterator menuIterator) {
        stack.push(menuIterator);
    }


    public boolean hasNext() {

        if ( stack.empty() ) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @SuppressWarnings("unchecked")
    public Object next() {
        if ( hasNext() ) {
            Iterator iterator = (Iterator) stack.peek();
            PizzeriaMenu position = (PizzeriaMenu) iterator.next();
            if (position instanceof Menu) {
                stack.push( position.iterator() );
            }
            return position;
        } else {
            return true;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
