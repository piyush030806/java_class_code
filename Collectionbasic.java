
import java.util.ArrayList;

public class Collectionbasic {
    public static void main(String[] args) {
        System.out.println("COllection in java");

        ArrayList<String>student=new ArrayList<>();
        student.add("Frnd1");
        student.add("Frnd2");
        student.add("Frnd3");
        student.add("Frnd4");

        System.out.println("Student List is "+student);

        for(String name:student){
            System.out.println("My name is "+name);
        }

        System.out.println(student.get(2));
    }
}
