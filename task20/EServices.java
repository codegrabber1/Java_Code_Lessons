package task20;

import java.util.concurrent.*;

public class EServices {
    int n;
    ExecutorService executor = Executors.newFixedThreadPool(2);

    public EServices(int n) {
        super();
        this.n = n;

    }
    public void firstM() {

        executor.submit(new Runnable() {
            @Override
            public void run() {
                new RunnableThread(n).start();
            }
        });

    }
    public void secondM() throws InterruptedException, ExecutionException {
        MyThread thread = new MyThread();

        Future<MyThread> f = executor.submit(new Callable<MyThread>() {

            @Override
            public MyThread call() throws Exception {

                thread.fib(n);
                return thread;
            }});

        while(!f.isDone()){
            Thread.sleep(1000);
            System.out.println("Waiting...");
        }
        System.out.println(f.get());

        System.out.println("FINISHED");
        executor.shutdown();

    }
}