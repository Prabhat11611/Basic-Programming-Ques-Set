public class Number_Pyramid {
    public static void main(String arg[]){
        int n=5;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // numbers -> print row number, row number times.
            for(int j=1; j<=i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
