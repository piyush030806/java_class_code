public class third {
    private String name;
    private int rollno;

    third(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public void display() {
        System.out.println(name + " " + rollno);
    }
    public static void main(String[] args) {
    third op = new third("John", 80);
    op.display();
    }
}