
import java.beans.IntrospectionException;

class MyTask implements Runnable{
    public void run(){
        System.out.println("thread is running");

        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(millis:1000);
            } 
            catch (InterruptedException e) {
                System.out.println("Thread interrupted "+e.getMessage());
            }
            System.out.println("Number: "+i);
        }
    }
}


public class RunnableExample {
    public static void main(String[] args) {
        MyTask task= new MyTask();
        Thread t=new Thread(task);
        t.start();

    }
}
