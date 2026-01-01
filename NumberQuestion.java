import java.util.*;

public class NumberQuestion {
    
    public static void main(String[] args) {

        System.out.println("Add five numbers and remove 2 index number and print again -- ");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(11);
        numbers.add(56);
        numbers.add(201);
        numbers.add(15);
        numbers.add(144);

        System.out.println("Numbers in Arraylist : " + numbers);

        numbers.remove(2); // it will remove 201 

        System.out.println("After removing the 2nd index : " + numbers);

    }
}
