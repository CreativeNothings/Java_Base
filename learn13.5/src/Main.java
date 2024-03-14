public class Main {
    public static void main(String[] args) throws InterruptedException {

        //中断线程
        Thread t= new MyThread();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        Thread hello = new HelloThread();
        hello.start();
        try{
            hello.join();
        }catch (InterruptedException e){
            System.err.println("Interrupted!!!");
        }
        hello.interrupt();
    }
}
//一个线程间共享的变量。线程间共享变量需要使用volatile关键字标记，
// 确保每个线程都能读取到更新后的变量值。

class HelloThread extends Thread{
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}