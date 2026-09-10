class Student {

    void display(int age) {
        System.out.println("Age: " + age);
    }

    void display(int age, String name) {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }

    void display(int age, String name, int mobile) {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
    }

    void display(int age, String name, int mobile, String mail_id) {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Email: " + mail_id);
    }


    public static void main(String[] args) {

        Student s = new Student();

        s.display(11);
        s.display(11, "Ajjjay");
        s.display(11, "Ajjjay", 987654321);
        s.display(11, "Ajjjay", 987654321, "ajjjay@gmail.com");
    }
}