abstract class Vechile {

    abstract void start();

    void stop(){
        System.out.println("Vehicle stopped");
    }

static void breakdown(){
    System.out.println("Vechile breakdown");
    }
}
class Car extends Vechile{
    void start(){
        System.out.println("Car starts with a key");
    }
}

public class Main {

    public static void main(String[] args){
        Vechile v=new Car();

        v.start();
        v.stop();
        Vechile.breakdown();
    }
}