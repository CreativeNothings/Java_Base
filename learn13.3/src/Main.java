public class Main {
    public static void main(String[] args) throws InterruptedException {
//         ┌─────────────┐
//         │     New     │
//         └─────────────┘
//                │
//                ▼
//┌ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ┐
// ┌─────────────┐ ┌─────────────┐
//││  Runnable   │ │   Blocked   ││
// └─────────────┘ └─────────────┘
//│┌─────────────┐ ┌─────────────┐│
// │   Waiting   │ │Timed Waiting│
//│└─────────────┘ └─────────────┘│
// ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─
//                │
//                ▼
//         ┌─────────────┐
//         │ Terminated  │
//         └─────────────┘
       //一个线程还可以等待另一个线程直到其运行结束。
        //t.join()
        Thread t = new Thread(()->{
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();
        t.join();
        System.out.println("end");
    }
}