import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //使用wait和notify
        TaskQueue q = new TaskQueue();
        ArrayList<Thread> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            Thread t = new Thread(){
                public void run(){
                    while (true){
                        try{
                            String s = q.getTask();
                            System.out.println("exe task: "+s);
                        }catch (InterruptedException e){
                            return;
                        }
                    }
                }
            };
            t.start();
            list.add(t);
        }
        Thread add = new Thread(() -> {
            for (int i=0; i<10; i++) {
                // 放入task:
                String s = "t-" + Math.random();
                System.out.println("add task: " + s);
                q.addTask(s);
                try { Thread.sleep(100); } catch(InterruptedException e) {}
            }
        });
        add.start();
        add.join();
        Thread.sleep(100);
        for (Thread t : list) {
            t.interrupt();
        }
    }
}

class TaskQueue{
    Queue<String> queue =new LinkedList<>();

    public synchronized void addTask(String s){
        this.queue.add(s);
        this.notifyAll();
    }

    public synchronized String getTask() throws InterruptedException{
        while(queue.isEmpty()){
            this.wait();
        }
        return queue.remove();
    }
}