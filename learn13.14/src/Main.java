import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        //使用线程池
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            es.submit(new Task("" + i));
        }
    }
}

class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("start task " + name);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        System.out.println("end task " + name);
    }
}