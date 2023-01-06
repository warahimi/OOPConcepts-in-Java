import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Array List
        ArrayList<String> names = new ArrayList<>();
        // or we can define array like:
        // List is an interface
        List<String> students = new ArrayList<>();

        // When declaring collection we can have only Objects as their type
        // non-primitive types cannot be their type
        //List<int> num = new ArrayList<>();

        // For primitive type we have their equivalent Java class that we can use as collection type
        List<Integer> numbers = new ArrayList<>();
        // ArrayList size in mutable
        names.add("Wahid");
        names.add("Hosna");

        System.out.println(names.get(0));
        System.out.println("Size: "+ names.size());

        //names.clear();
        names.remove("Wahid");
        System.out.println("Size: "+ names.size());
        System.out.println(names.contains("Wahid"));
        System.out.println(names.contains("Hosna"));
        System.out.println(names.isEmpty());
        // to get the index of an element
        System.out.println(names.indexOf("Wahid")); // returns -1 if not available
        System.out.println(names.indexOf("Hosna"));
        names.add("Farima");
        names.add("Abdullah");
        names.add("Mustafa");
        names.add("Bari");

        // Sorting array list elements

        // sort method requires a comparator
        //names.sort();

        for(int i =0 ; i< names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        // foreach loop
        for(String name : names)
            System.out.println(name);

        // MAPS in Java
        // Maps are key-value pairs
        Map<String, String> contacts = new HashMap<>();
        contacts.put("Wahid", "Wahid@gamil");
        System.out.println(contacts.get("Wahid"));

        // Collection is the generic type of all collection types in java
        // same as array list we cannot use the primitive data types as key or value for the map
    }
}