// Write a function that calculates the Greatest Common Divisor of 2 numbers. 

import java.util.*;
public class Question9 {
    public static int res(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return res(b, a%b);
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= sc.nextInt();
        System.out.print("Enter the second number: ");
        int b= sc.nextInt();

        int result=res(a,b);
        System.out.print("The GCD of "+a+" and "+b+" is: "+result);
    }
}
