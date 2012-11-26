/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Iterator;

import java.util.Iterator;


public class EmptyIterator implements Iterator{

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
