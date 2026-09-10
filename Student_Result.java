import java.util.Scanner;
class student{
    String name;
    int marks;

    void setMarks(int marks) throws Exception{
        if(marks<0||marks>100){
            throw new Exception("Invalid marks! Must be in range ");
        }
        this.marks=marks;
    }
}



public class Student_Result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        student s=new student();

        System.out.println("Enter student name : ");
        s.name=sc.nextLine();

        System.out.println("Enter marks: ");
        int marks=sc.nextInt();

        try {
            s.setMarks(marks);
            System.out.println("Student name: "+s.name);
            System.out.println("Student marks: "+s.marks);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Result Proceding completed.");
        }

    }
}
