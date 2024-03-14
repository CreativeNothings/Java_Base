public class Main {
    public static void main(String[] args) throws InterruptedException {

        //中断线程 interrrupt()
        Thread t =new MyThread();
        t.start();
        Thread.sleep(1);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}
class MyThread extends Thread{
    public void run(){
        int n=0;
        while(! isInterrupted()){
            n++;
            System.out.println(n+" hello!");
        }
    }
}