package Homework_week9;

import java.util.Scanner;

public class Ans2 {
    public static void main(String[] args) {
       int math_score = 98;
       int science_score = 90;
       int english_score = 85;
       int total = 273;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks above : 35");
        int score = sc.nextInt();
        while (score>35){
            score++;
            if (score<= 98) {
                math_score++;
            } else if (score<90) {
                science_score++;
            }else {
                english_score++;

            }
        }
        System.out.println("Total marks" +score);
        System.out.println("math_score" +score);
        System.out.println("science_score" +score);
        System.out.println("english_score" +score);


    }
}
