import java.util.ArrayList;


public class ArrayListDemo {

    public static void main(String[] args) {

        System.out.println("Array List : ");

        ArrayList<String> fruits= new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Watermelon");
        
        System.out.println(fruits);

        ArrayList<Integer> runs = new ArrayList<>();

        runs.add(245);
        runs.add(126);
        runs.add(312);
        runs.add(99);

        System.out.println(runs);

       ArrayList<String> players = new ArrayList<>();

       // Adding of elements in the ArrayList of Stirng DataTypes
       players.add("Rohit Sharma");
       players.add("Virat Kohli");
       players.add("Hardik Pnadya");
       System.out.println(players);

       // Q. can we add different DataTypes at the same time? How?
       // Q. Can we all others DataTypes such as Integer,Short, etc? 

       // Removing of elements from the ArrayList

       players.remove(0);

       System.out.println(players);

       players.remove("Virat Kohli");

       System.out.println("After removing : " + players);

       players.add(1, "Suryakumar Yadav");
       //  players.add(5, "Suryakumar Yadav");   -- Index our of bound exception
       System.out.println("After adding an element in the array list at 1 index : " + players);

    }
}