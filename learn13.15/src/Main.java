import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        //需要定期反复执行，例如，每秒刷新证券价格。
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(4);
        //提交一次性任务
        ses.schedule(new Task("one-time"),1, TimeUnit.SECONDS);
        //固定每三秒执行一次
        ses.scheduleAtFixedRate(new Task("auto 3s/per"),2,3,TimeUnit.SECONDS);
        //三秒间隔执行一次（注意区别）
        ses.scheduleWithFixedDelay(new Task("delay"),2,3,TimeUnit.SECONDS);
    }
}
class Task implements Runnable{
    private String name;

    public Task(String s) {
        this.name = s;
    }

    public void run(){
        System.out.println(name);
    }
}