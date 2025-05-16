// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;
public class Question5 {
    public static void age(int n){
        if(n>18){
            System.out.print("This person is eligible to Vote.");
        }
        else{
            System.out.print("This person is not eligible to vote.");
        }
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int n=sc.nextInt();

        age(n);
    }
}
