package task22;

import static java.lang.System.out;

public class Test {

    /**
     * Initialize some fields.
     */
    private int a;
    private int b;
    private String c;

    /**
     * Creating first construct with two parameters.
     *
     * @param a
     * @param b
     */

    public Test(int a, int b) {
        this.a = a;
        this.b = b;

    }

    /**
     * Overload construct using parameters from previous construct.
     *
     * @param a
     * @param b
     * @param c
     */
    public Test(int a, int b, String c) {
        this(a, b);
        this.c = c;

    }

    public void show() {
        if (c != null) {
            out.println(a + " and " + b + " with " + c);
        } else {
            out.println(a + " and " + b + " from first construct ");
        }
    }
}
