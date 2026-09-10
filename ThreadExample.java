class invlaidAgeException extends RuntimeException{
    invlaidAgeException(String msg){
        super(msg);
    }
}

class validateAge extends Thread{
int age=10;
public void run(){
    if(age<18){
        System.out.println("Not eligilble for vote");
    }
    else{
        System.out.println("Eligilbe for vote");
    }
}
}

public class ThreadExample {
    public static void main(String[] args) {
        validateAge t1=new validateAge();
        t1.start();
    }
}
