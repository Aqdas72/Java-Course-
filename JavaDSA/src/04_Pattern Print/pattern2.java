

public class pattern2 {
    public static void main(String[] args) {
        /**
        *
        **
        ***
        ****
         */

        int n=4;
/*
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println("");
        }*/

        //Inverted right angle 
        /*
        ****
        ***
        **
        *
        */

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
