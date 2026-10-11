import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        //Diamond pattern

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the diamond:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            //part1
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //part2 stars printing
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for(int i=1;i<=n;i++){
            //part1 
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //part2 stars
            for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //Hollow Diamond
        for(int i=1;i<=n;i++){
            //for part1 space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //for stars print
            if(i==1){
                System.out.print("*");
            } else{
                //row1 star
                System.out.print("*");
                //spaces
                for(int j=1;j<=2*i-3;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=1;i<=n;i++){
            //space 
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            //pattern print
            for(int j=1;j<=2*(n-i)-1;j++){
                if(j==1 || j==2*(n-i)-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
