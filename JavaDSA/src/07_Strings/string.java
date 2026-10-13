
import java.util.Scanner;

public class string {
    static void main() {
        //String
        //Creating a String
        //1. String literals
        String str = "Aqdas";

        //2. using new keyword
        String hello = new String("Hello");
        System.out.println(hello);
        System.out.println(hello.length());

        //str(2) = 'a';
        //* String is immutable
        // but reference shifting is possible 

        String name = "Aqdas";
        name = "Hello"; //Here name shifting its memory reference to hello

        //Comparing Strings
        String name1 = "Aqdas";
        String name2 = "aqdas";
        if(name1 == name2){ //checks only the reference of both String
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        if(name1.equals(name2)){//checks actual String word by word and case sensetive too
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        if(name1.equalsIgnoreCase(name2)){//checks only the character and also not case sensetive
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        //String input
        Scanner sc = new Scanner(System.in);
        String str3 = sc.nextLine();
        System.out.println(str3);
    }
}
