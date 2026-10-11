import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args){
        /* Datatype -> size of data
                    -> type of data
           dataTypes is of two types
           1. Primitive - which are build in datatypes in java
           2. Non-Primitive - which are made from classes and object like String , Array etc

           there are 8 primitive datatypes
           1. int   --> 4 byte
           2. char  --> 2 byte
           3. float --> 4 byte
           4. double --> 8 byte
           5. Boolean --> JVM dependent
           6. byte --> 1 byte(8 bits)
           7. short
           8. long
        */

        int num1 = 233;
        System.out.println(num1);

        byte num2 = 120; // byte range - (-127 to 127)
        System.out.println(num2);

        float num3 = 12.45f;
        System.out.println(num3);


        //* Taking an input from the user
        Scanner sc  = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int age = sc.nextInt();

        //* Ternary Operator
//        String ans = (age > 18) ? "Eligible to vote" : "Not Eligible to vote";
//        System.out.println(ans);


        //* Switch Statement
        System.out.println("Enter todays day");
        String day = sc.nextLine();


        switch(day){
            case "Monday":
                System.out.println("Hi today is monday");
                break;
            case "Tuesday":
                System.out.println("Hi today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Hi today is Wednesday");
                break;
            default:
                System.out.println("We are close today");
                break;
        }
    }
}
