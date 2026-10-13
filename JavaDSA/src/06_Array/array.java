
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //declaration 
        int arr[];

        //memory allocation
        arr = new int[4];

        //Initialisation
        int arr1[] = {23,45,12};

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        //using forEach loop
        int sum = 0;
        for(int val:arr1){
            sum = sum + val;
            System.out.println(val);
        }
        System.out.println("Sum :" + sum);

        //taking an input in an array
        int brr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<brr.length;i++){
            System.out.print("Enter the value : ");
            brr[i] = sc.nextInt();
        }

        int mul = 1;
        for(int val:brr){
            System.out.println(val);
            mul = mul * val;
        }
        System.out.println("Multiplication of all values : " + mul);

        //Find maximum value in an array
        int max = brr[0];
        for(int i = 0;i<brr.length;i++){
            if(max < brr[i]){
                max = brr[i];
            }
        }
        System.out.println("Maximum value is : " + max);

        //Find the minimum value inside the array
        int minValue = brr[0];
        for(int i=0;i<brr.length;i++){
            if(minValue > brr[i]){
                minValue = brr[i];
            }
        }
        System.out.println("Minimum value : " + minValue);
    }
}
