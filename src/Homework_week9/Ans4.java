package Homework_week9;

import java.util.ArrayList;
import java.util.Iterator;

public class Ans4 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Anupama");
        name.add("Mihir");
        name.add("Jivansh");

        Iterator<String> iterator = name.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }


        }
    }



