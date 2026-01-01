import java.util.*;

public class City {
    
    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>();

        city.add("Pune");
        city.add("Mumbai");
        city.add("Nagpur");
        city.add("Banglore");
        city.add("Australia");

        System.out.println(city);
        System.out.println("Replace Nagpur with Japan");

        city.set(2, "Japan");

        System.out.println("after replacing : " + city);

        // check whether Pune is exit ?? 

        boolean isCityPresent = city.contains("Pune");

        System.out.println("Is city present ?? " + isCityPresent);

        // Size of arraylist 

        System.out.println("Size of ArrayList : " + city.size());

        for(int i = 0; i < city.size(); i++) {
            System.out.println(city.get(i) );
        }

        
    }
}
