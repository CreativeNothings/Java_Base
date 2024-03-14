import java.util.UUID;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

//它需要保证同一时刻最多有N个线程能访问

    }
}

class AccessLimitControl{
    final Semaphore semaphore = new Semaphore(3);
    public String access() throws Exception{
        semaphore.acquire();
        try{
            return UUID.randomUUID().toString();
        }finally {
            semaphore.release();
        }
    }
}