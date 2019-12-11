package ClassTest;

import java.util.Collection;
import java.util.Iterator;

public class MyCollection implements Collection {
    Object[] obj = new Object[20];

    @Override
    public int size() {
        return obj.length;
    }

    @Override
    public boolean isEmpty() {
        if (obj == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        int count = 0;
        for (int i = 0; i < obj.length; i++) {
            if (o == obj[i]) {
                count++;
            }
        }
        if (count != 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
