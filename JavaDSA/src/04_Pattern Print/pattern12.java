public class pattern12 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            //part1
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            //part2
            for(int j=1;j<=i;j++){
                int a=j;
                int b=('A'-1);
                int ans=a+b;
                char finalAns=(char)ans;
                System.out.print(finalAns + " ");
            }
            //part3
            int colValue = i;
            for(int j=1;j<=i-1;j++){
                int a =('A');
                char finalAns = (char)(a + colValue-2);
                System.out.print(finalAns + " ");
                colValue--;
            }
            System.out.println("");

        }
    }
}
