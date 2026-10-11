public class pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int a = j;
                int b = ('A' - 1);
                int ans = a+b;
                char finalAns = (char)ans;
                System.out.print(finalAns + " ");
            }
            System.out.println("");
        }

        //Reverse alphabet pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int a = n-j;//4
                int b = ('A');//97
                int ans= a+b;//97+4=101(E)
                char finalAns = (char)ans;
                System.out.print(finalAns + " ");
            }
            System.out.println("");
        }
    }
}
