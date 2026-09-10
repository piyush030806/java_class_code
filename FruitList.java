import java.util.ArrayList;
public class FruitList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("dragonfruit");
        list.add("Orange");
        list.add("Date");

        System.out.println("After adding: " + list);

        list.remove("Banana");

        System.out.println("After removing Banana: " + list);

        list.add("Grapes");

        System.out.println("Final list: " + list);
        System.out.println("Array lsit after remove "+list.removeLast());
        list.sort(null);
        System.out.println("Sorted list" +list);
    }
}