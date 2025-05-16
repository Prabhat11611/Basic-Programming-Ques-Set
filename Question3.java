// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class Question3 {
    public static void greater(int a, int b){
        if(a>b){
            System.out.print("A is greater than B.");
        }
        else if (a==b){
            System.out.print("A and B, both are equal.");
        }
        else{
            System.out.print("B is greater than A.");
        }
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();

        greater(a,b);
    }
}
