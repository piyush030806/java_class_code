//import java.util.Scanner;
class Calculate{
    int a=5,b=5;
    int add(int a, int b){
        
        return a+b;

    }
    double division(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
      Calculate c=new Calculate();
        System.out.println("Addition:"+c.add(c.a,c.b));
        System.out.println("Division:"+c.division(c.a,c.b));
    }
}