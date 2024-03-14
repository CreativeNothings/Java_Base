import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        //ReentranLock

    }
}
class Counter{
    private final Lock lock = new ReentrantLock();
    private int count;

    public void add(int n){
        lock.lock();
        try{
            count+=n;
        }finally {
            lock.unlock();
        }
    }

}