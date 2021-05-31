package HW3_Counter;

public class Counter implements Runnable{
    CountLock count;

    public Counter(CountLock  count){
        this.count = count;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        count.incCounter();

    }
}
