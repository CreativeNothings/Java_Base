import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class Main {
    public static void main(String[] args) {

        //ReadWriteLock
        //允许多个线程同时读，但只要有一个线程在写，其他线程就必须等待

    }
}

class Counter{
    private final ReadWriteLock lock = new ReadWriteLock() {
        @Override
        public Lock readLock() {
            return null;
        }

        @Override
        public Lock writeLock() {
            return null;
        }
    };
    private final Lock rlock = lock.readLock();
    private final Lock wlock = lock.writeLock();
    private int[] counts = new int[10];

    public void inc(int index){
        wlock.lock();
        try{
            counts[index]++;
        }finally {
            wlock.unlock();
        }
    }

    public int[] get(){
        rlock.lock();
        try{
           return Arrays.copyOf(counts,counts.length);}finally {
            rlock.unlock();
        }
    }
}