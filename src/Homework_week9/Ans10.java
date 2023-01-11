package Homework_week9;

import java.util.ArrayList;

public class Ans10 {
    public static void main(String[] args) {
        ArrayList<String> name1 = new ArrayList();
        name1.add("Anupama");
        name1.add("Ridhhi");
        name1.add("Nidhi");
        name1.add("Kunal");
        name1.add("Anish");
        name1.add("Paresh");
        System.out.println(name1 + "---------1st line");
        name1.set(2, "Anupama");
        System.out.println(name1 + "---------2nd line");
        name1.remove(1);
        System.out.println(name1 + "----------3rd line");


        ArrayList<String> name2 = new ArrayList<>();
        name2.addAll(name1);
        System.out.println(name2);

        for (String e : name2) {
            if (e.equalsIgnoreCase("Anupama")) {
                System.out.println(e);
            }
        }

    }
}
