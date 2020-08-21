package task20;

public class MyThread extends Thread{
    public void fib(int n) throws InterruptedException {

        int [] f = new int [n];

        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i -2];
        }
        for (int i = 0; i < n; ++i) {
            Thread.sleep(2000);
            System.out.println(f[i]);
        }



    }
}