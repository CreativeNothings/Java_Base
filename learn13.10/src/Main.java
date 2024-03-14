import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

      //synchronized 配合wait和notify（All）
        // ReentrantLock 使用Condition 对象的signAll和await来实现相同效果
    }
}

class TaskQueue{
    private final Lock lock =new ReentrantLock();
    private final Condition con = lock.newCondition();

    private Queue<String> queue = new LinkedList<>();

    public void addTask(String s){
        lock.lock();
        try{
            queue.add(s);
            con.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public String getTask() throws InterruptedException {
        lock.lock();
        try{
            while (queue.isEmpty()){
                con.await();
            }
            return queue.remove();
        }finally {
            lock.unlock();
        }
    }
}