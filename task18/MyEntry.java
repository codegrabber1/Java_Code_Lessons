package task18;

public class MyEntry<K,V> {

    private K o1;
    private V o2;

    public MyEntry(K o1, V o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public K getO1() {
        return o1;
    }

    public void setO1(K o1) {
        this.o1 = o1;
    }

    public V getO2() {
        return o2;
    }

    public void setO2(V o2) {
        this.o2 = o2;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "o1=" + o1 +
                ", o2=" + o2 +
                '}';
    }
}