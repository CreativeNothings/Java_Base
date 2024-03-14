public class Main {
    public static void main(String[] args) {

        //多线程启动！！！！！！！！！！！
        //创建新线程
        Thread t =new Thread();
        t.start();
        Thread newt = new newThread();
        newt.start();
        Thread newt1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start new thread!");
            }
        });
    }
}
class newThread extends Thread{
    public void run(){
        System.out.println("start new thread !");
    }
}