package HW3;

import java.net.http.WebSocket;

public class Main {

    private String ping="ping";
    private String pong="pong";
    private boolean turn;

    public synchronized String pingTurn(){
        while (turn) {
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        notify();
        turn=true;
        System.out.println(ping);

        return ping;

    }

    public synchronized String pongTurn(){
        while (!turn) {
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }


        }
        turn=false;
        System.out.println(pong);
        notify();
        return pong;

    }



    public static void main(String[] args) throws InterruptedException {

                Main main=new Main();
    while (true) {
            new Thread(() -> main.pingTurn()).start();
            Thread.sleep(1000);
            new Thread(() -> main.pongTurn()).start();
            Thread.sleep(1000);
        }
    }
}
