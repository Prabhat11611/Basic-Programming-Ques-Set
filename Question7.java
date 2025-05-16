// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;
public class Question7 {
    public static void number(int n){
        if(n>0){
            System.out.print("This is a Positive Number.");
        }
        else if(n<0){
            System.out.print("This is a Negative Number.");
        }
        else{
            System.out.print("The entered number is Zero.");
        }
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        number(n);
    }
}
