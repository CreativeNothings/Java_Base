public class Main {
    public static void main(String[] args) {

        System.out.println("main start...");
        Thread t = new Thread() {
            public void run() {
                System.out.println("thread run...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("thread end...");

            }
        };
        t.start();//不能执行t.run.
        System.out.println("main end...");
    }
}