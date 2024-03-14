import java.util.concurrent.locks.StampedLock;

public class Main {
    public static void main(String[] args) {

        //如果我们深入分析ReadWriteLock，会发现它有个潜在的问题：
        // 如果有线程正在读，写线程需要等待读线程释放锁后才能获取写锁，
        // 即读的过程中不允许写，这是一种悲观的读锁。
        //引入StampedLock
        //读过程可以写入，但需要判写

    }
}

class Point {
    private final StampedLock slock = new StampedLock();
    private double x;
    private double y;

    public void move(double dx, double dy) {
        long stamp = slock.writeLock();
        try {
            x += dx;
            y += dy;
        } finally {
            slock.unlockWrite(stamp);
        }
    }

    public double distanceFromOrigin() {
        long stamp = slock.tryOptimisticRead();
        double currentX = x;
        double currentY = y;
        if (!slock.validate(stamp)) {
            stamp = slock.readLock();
            try {
                currentX = x;
                currentY = y;
            } finally {
                slock.unlockRead(stamp);
            }
        }
        return Math.sqrt(currentX * currentX + currentY * currentY);
    }
}

