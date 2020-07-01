package task12.my.list;

import java.util.Iterator;

public class MyList<E> implements IMy<E>{

    /*
     * The main array
     */
    private E[] values;


    @SuppressWarnings("unchecked")
    public MyList(){
        values = (E[]) new Object[0];
    }

    @Override
    public Iterator<E> iterator() {

        return new ArrIterator<>(values);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean add(E e) {

        try {
            E[] temporary = values;
            values = (E[]) new Object[temporary.length + 1];

            System.arraycopy(temporary, 0, values, 0, temporary.length);
            values[values.length-1] = e;


            return true;
        }catch(ClassCastException ex) {
            ex.printStackTrace();
        }

        return false;

    }

    @Override
    public E get(int index) {

        return values[index];
    }

    @SuppressWarnings("unchecked")
    @Override
    public void remove(int index) {
        try {
            E[] temporary = values;
            values = (E[]) new Object[temporary.length - 1];

            System.arraycopy(temporary, 0, values, 0, index);

            int countElementsAfterIndex = temporary.length - index-1;

            System.arraycopy(temporary, index + 1, values, index, countElementsAfterIndex);

        }catch(ClassCastException ex) {

            ex.printStackTrace();

        }


    }

    @Override
    public int size() {

        return values.length;
    }


}