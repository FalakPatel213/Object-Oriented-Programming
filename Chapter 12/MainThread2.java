// By using Runable interface.

// Java Multi-threading example by implementing runnable.

public class MainThread2 {
    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            MultiThreading2 r = new MultiThreading2();
            Thread t = new Thread(r);
            t.start();
        }
    }
}

// Runnable is a interface, when we create child of a interface we have to use "implements".

class MultiThreading2 implements Runnable{
    public void run(){           // It should be always name "run".
        for(int i = 1; i < 3; i ++){
            String test = Thread.currentThread().getName();
            System.out.println("Hello From = "+ test);
        }
    }
}
