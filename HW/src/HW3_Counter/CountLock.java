package HW3_Counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CountLock {
    int cnt = 0;
    Lock l = new ReentrantLock();

    void incCounter() {
        l.lock();
        try {
            cnt++;
        }
        finally {
            System.out.println(Thread.currentThread().getName() + ":" + " Counter value: " + cnt);
            l.unlock();
        }
    }
}
