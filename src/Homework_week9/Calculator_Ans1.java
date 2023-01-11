package Homework_week9;


import java.util.Scanner;

public class Calculator_Ans1 {
    // Declare instance method
    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println("addition = " + ans);
    }

    // Declare instance method
    public void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("subtraction = " + ans);
    }

    // Declare instance method
    public void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("multiplication = " + ans);

    }

    // Declare instance method
    public void Division(int a, int b) {
        int ans = a / b;
        System.out.println("Division = " + ans);

    }
    void calculateResult(int a, int b ,char c) {
        Calculator_Ans1 obj = new Calculator_Ans1();   //create Object
        if (c == '+') {
            addition(a, b);
        } else if (c == '-') {
            subtraction(a, b);
        } else if (c == '*') {
            multiplication(a, b);
        } else {
            addition(a, b);
        }
    }

      // Main Method
      public static void main(String[] args) {
        Calculator_Ans1 obj = new Calculator_Ans1();   //Create a object
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter first Number: ");
          int num1 = sc.nextInt();
          System.out.println("Enter Second Number: ");
          int num2 = sc.nextInt();
          System.out.println("please enter one of symbol +, -, *, /: ");
          char c = sc.next().charAt(0);
          obj.calculateResult(num1,num2,c);


      }
}