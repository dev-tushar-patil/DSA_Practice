import java.util.*;

public class Colours {
    
    public static void main(String[] args) {

        System.out.println("Add five colurs in array list and only show the first and last index -- ");

        // Accessing an element - get(index)
        
        ArrayList<String> col = new ArrayList<>();

        col.add("Blue");
        col.add("White");
        col.add("Yellow");
        col.add("Brown");
        col.add("Black");

        System.out.println("First Element : " + col.get(0) + " Last Element :  " + col.get((col.size()-1)));
    }
}
