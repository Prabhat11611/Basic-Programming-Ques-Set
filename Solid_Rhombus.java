public class Solid_Rhombus {
    public static void main(String arg[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // For Stars
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}