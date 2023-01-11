package Homework_week9;
import java.util.HashMap;
//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

public class Ans7 {
    public static void main(String[] args) {
        //create a object
        HashMap<String, Integer> capitalcities = new HashMap< String, Integer>();
        capitalcities.put("Croydon", 1);
        capitalcities.put("London Road", 2);
        capitalcities.put("Galpins Road", 3);
        capitalcities.put("Norbury", 4);
        System.out.println(capitalcities);

    }

}

