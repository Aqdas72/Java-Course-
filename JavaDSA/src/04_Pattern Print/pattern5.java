public class pattern5 {
    public static void main(String[] args) {
        /**
        Hollow rectange
        ******
        *    *
        *    *
        ******
         */

        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(i==2 || i==3){
                    if(j==1 || j==6){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                } else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
