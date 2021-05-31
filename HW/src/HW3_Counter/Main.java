package HW3_Counter;

public class Main {

    public static void main(String[] args) {
        CountLock e = new CountLock();
        Thread t[] = new Thread[3];

        for(int i=0;i<3;i++) {
            t[i] = new Thread(new Counter(e), "Thread " + i);
        }
        for(int i=0;i<3;i++) {
            t[i].start();
        }

    }
}
