
import java.util.Scanner;

class TwoDArray {
    static void main(){
        //2D - Array
        //Declaration
        //int[rowIndex][colIndex]
        int[][] arr;

        //initialisation
        int[][] arr1 = new int[3][4];

        int[][] arr2 = {{2,3,4},{3,5,6}};
        //               row0     row1


        //Print

        /*int rowLength = arr2.length;
        int colLength = arr2[0].length;
        for(int row=0;row<rowLength;row++){
            for(int col=0;col<colLength;col++){
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println("");
        }*/


        //2D-Array with different column length or Jacked Array
        System.out.println("Jacked Array");
        int[][] brr = {
            {2,3,4},
            {1,2},
            {12,11,10,9},
            {7}
        };

        int rowLength1 = brr.length;
        for(int i=0;i<rowLength1;i++){
            int colLength1 = brr[i].length;
            for(int j=0;j<colLength1;j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }

        //memory allocation from client/user
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row length : ");
        int rowlength = sc.nextInt();
        int[][] arr4 = new int[rowlength][];
        for(int i=0;i<rowlength;i++){
            System.out.print("Enter the column Length : ");
            int colLength = sc.nextInt();
            arr4[i] = new int[colLength];
        }

        for(int i=0;i<rowlength;i++){
            int colLength=arr4[i].length;
            for(int j=0;j<colLength;j++){
                System.out.print("Enter value of " + i +","+ j + ":");
                int value = sc.nextInt();
                arr4[i][j] = value;
            }
        }

        for(int i=0;i<rowlength;i++){
            int colLength = arr4[i].length;
            for(int j=0;j<colLength;j++){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for(int i=0;i<rowlength;i++){
            int colLength = arr4[i].length;
            for(int j=0;j<colLength;j++){
                sum = sum + arr4[i][j];
            }
        }
        System.out.println("Total sum of 2d array element : " + sum);


        int maxValue = arr4[0][0];
        for(int i=0;i<rowlength;i++){
            int colLength = arr4[i].length;
            for(int j=0;j<colLength;j++){
                if(arr4[i][j] > maxValue){
                    maxValue = arr4[i][j];
                }
            }
        }   
        System.out.println("Max Element in an 2D arry : " + maxValue);


        //column wise sum
        for(int j=0;j<2;j++){
            int colSum = 0;
            for(int i=0;i<arr4.length;i++){
                colSum += arr4[i][j];
            }
            System.out.println("Sum of column" + j + colSum);
        }

        //Row wise sum
        for(int i=0;i<rowlength;i++){
            int rowSum = 0;
            for(int j=0;j<arr4[i].length;j++){
                rowSum += arr4[i][j];
            }
            System.out.println("Totol sum of row " + i + " : "+rowSum);
        }
    }
}
