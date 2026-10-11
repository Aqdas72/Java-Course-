
import java.util.Scanner;

public class pattern1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("What height of square you want?:");
        int n = sc.nextInt();

        //Square pattern
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //rectange pattern
        System.out.println("Rectange");
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n+2;col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}