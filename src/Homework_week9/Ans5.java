package Homework_week9;
import java.util.ArrayList;


public class Ans5 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Tooting");
        name.add("Euston");
        name.add("Denmark");
        name.add("Stretham");
        name.add("Croydon");
        System.out.println(name);

        boolean result = name.isEmpty();
        System.out.println("List is Empty? " + result );

    }

}
