/**
 * interface
 */

 interface Employ {
void EmpInfo();
    
}
interface EmpSalary{
    void SalaryInfo();
}
public class Inheritence implements Employ, EmpSalary{
String name;
int age;
double salary;
Inheritence(String name,int age,double salary){
    this.name=name;
    this.age=age;
    this.salary=salary;
}

@Override
public void EmpInfo(){
    System.out.println("Employee Name"+name);
    System.out.println("Employee Age"+age);
}

@Override
public void SalaryInfo(){
    System.out.println("Employee Salary"+salary);
}
public static void main(String []args){
    Inheritence obj=new Inheritence("Ajay",24,25889.90);
    obj.EmpInfo();
    obj.SalaryInfo();
}
}
