public class pattern11 {
    public static void main(String[] args) {
        int n=4;
       
        for(int i=1;i<=n;i++){
            //part1
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            //part2
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
