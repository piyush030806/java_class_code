import java.util.Vector;

public class vector {
    public static void main(String[] args) {

        Vector<String> vectorList = new Vector<>();

        vectorList.add("C");
        vectorList.add("C++");
        vectorList.add("Java");
        vectorList.add("Python");
        vectorList.add("PHP");

        System.out.println("Vector list is " + vectorList);

        vectorList.addLast("c#");
        vectorList.addLast("Ruby");
        vectorList.add(2,"Perl");
        System.out.println("Update list after adding "+vectorList);

        System.out.println(vectorList.size());
        vectorList.remove(3);
        System.out.println(vectorList);

        vectorList.removeLast();
        System.out.println(vectorList);
        
    }
}

