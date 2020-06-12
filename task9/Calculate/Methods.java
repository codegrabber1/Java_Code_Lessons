package task9.Calculate;

/**
 * The {@code Methods} represents the using my own exception.
 * @see MyException
 */
public class Methods {
    private double num;
    private double denom;
    private char op;

    /**
     * Searching for exceptions.
     * @param num
     * @param denom
     * @throws MyException
     */
    public Methods(double num, double denom) throws MyException {
        this.num = num;
        this.denom = denom;

        if(num < 0 & denom < 0) {
            String message = " IllegalArgumentException";
            throw new MyException(message);
        } else if ((num == 0 & denom != 0) || (num !=0 & denom == 0)) {
            String message = " ArithmeticException";
            throw new MyException(message);
        } else if (num == 0 & denom == 0) {
            String message = "IllegalAccessException";
            throw new MyException(message);
        }
        else if (num > 0 & denom > 0){
            String message = "Your nums are bigger than 0";
            System.out.println(message);
            throw new MyException(message);
        }
    }

    /**
     * Doing arithmetic operations.
     * @param op
     * @throws MyException
     */

    public void doAction(char op) throws MyException {

        switch(op){

            case '+': {
                System.out.println(num + " + " + denom + " = " + (num + denom));
                break;
            }
            case '-': {
                System.out.println(num + " - " + denom + " = " + (num - denom));
                break;
            }
            case '*':{
                System.out.println(num + " * " + denom + " = " + (num * denom));
                break;
            }
            case '/': {
                if(denom == 0){
                    System.out.println(num + " / " + denom + " = " + (num / denom));
                }

                break;
            }

        }
    }

}
