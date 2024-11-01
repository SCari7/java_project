package classwork_35.ilist.model;

import java.util.Arrays;
import java.util.Iterator;

public class IListImpl implements IList {

    Object[] elements;

    private  int size;

    //конструктор
    public IListImpl(int initialCapacity)  {
        //защита

        if (initialCapacity< 0){

            //дает возможность проверить ошибку и не вылететь из программы
            throw new IllegalArgumentException("Illegal capacity " + initialCapacity);
        }

        elements = new Object[initialCapacity];

    }
    public IListImpl(){
        this(10);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(Object element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    private void ensureCapacity() {
        if (size == elements.length){
            if (size == Integer.MAX_VALUE){
                throw new OutOfMemoryError("T error T");
            }
            int newCapacity = elements.length + elements.length / 2;
            if (newCapacity < 0){
                newCapacity = Integer.MAX_VALUE;
            }

            elements = Arrays.copyOf(elements, newCapacity);
        }
    }


    @Override
    public boolean add(int index, Object element) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
