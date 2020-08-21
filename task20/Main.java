package task20;


import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("=== Using Runnable && Thread ===");
        MyThread myThread = new MyThread();

        /**
         * Method extends Thread.
         */
        myThread.fib(n);

        /**
         * Method implements Runnable.
         */
        new RunnableThread(n).start();

        System.out.println("=== ExecutorService ===");
        EServices es = new EServices(n);

        /**
         * Methods with ExecutorService.
         */
        es.firstM();
        es.secondM();
    }
}