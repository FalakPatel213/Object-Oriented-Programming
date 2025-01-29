class ChildThred extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i ++){
            System.out.println(i);
        }
    }
}

public class ExamplePrint {
    public static void main(String[] args) {
        ChildThred child = new ChildThred();
        child.start();
        System.out.println("Child Thread execution completed.");
    }
}
