// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class Question4 {
    public static void radius(int r){
        // float circumference = 2 * (22.0/7) * r;  This is giving the error.
        // Method 1 - using explicitly cast the result expression '(22.0/7)' to 'float'.
        // float circumference = (float) (2 * (22.0/7) * r);
        // Method 2 - by changing the data type of circumference to double.
        double circumference =2*(22.0/7) *r;
        System.out.print("The circumference of a Circle is: "+circumference);
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a Circle: ");
        int r=sc.nextInt();

        radius(r);
    }
}
