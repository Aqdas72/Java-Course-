public class pattern8 {
    public static void main(String[] args) {
        int n=4;

        for(int i=1;i<=n;i++){
            //part1
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //part2 - spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //part3 - stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        for(int i=1;i<=n;i++){
            //part4 - inverted
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            //part5 - inverted space
            for(int j=1;j<=(i-1)*2;j++){
                System.out.print("  ");
            }
            //part6
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
