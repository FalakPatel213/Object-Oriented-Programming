// By using thread class.

// Java Multi-threading example by extending Thread class.

public class MainThread1 {
    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            MultiThreading t = new MultiThreading();
            t.start();
        }
    }
}

// Thread class is a child of Runable.

class MultiThreading extends Thread{
    public void run(){           // It should be always name "run".
        for(int i = 1; i < 3; i ++){
            String test = Thread.currentThread().getName();
            System.out.println("Hello From = "+ test);
        }
    }
}

// If one class is a subset of another class, then it is called "extending".
