
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        // pyramid pattern
        /**
          *
         ***
        *****
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //for part 1 space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //for pattern print
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
           System.out.println("");

        }
           //Inverted pyramid
            /*
            *****
             ***
              *
            */

            for (int k = 1; k <= n; k++) {
                //for space
                for(int j=1;j<k;j++){
                    System.out.print(" ");
                }

                //for stars
                for(int j=1;j<=2*(n-k)+1;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }

        
    }
}
