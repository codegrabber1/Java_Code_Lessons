package task12.my.list;

public interface IMy<E> extends Iterable<E> {

    /*
     * The method to add an element into a list{%MyList%}
     */
    boolean add(E e);

    /*
     * The method to get an element from a list{%MyList%}
     */
    E get(int index);

    /*
     * The method shows the size of list {%MyList%}
     */
    int size();


    /*
     * The method to remove an element from a list {%MyList%}
     */

    void remove(int index);

}