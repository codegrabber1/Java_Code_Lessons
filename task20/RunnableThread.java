package task20;

public class RunnableThread implements Runnable{

    Thread go;

    int n;
    public RunnableThread(int n) {
        this.n = n;
    }
    public void start(){
        if(go == null) {
            go = new Thread(this);
        }
        go.start();
    }

    public void stop(){
        if(go == null) {
            go = new Thread(this);
        }
        go.interrupt();
    }

    @Override
    public void run() {

        int fib[] = new int [n];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < n; ++i) {
            fib[i] = fib[i -1 ] + fib[i-2];
        }

        for (int i = fib.length-1; i >= 0; --i) {
            try {

                Thread.sleep(1000);
                System.out.println(fib[i]);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}