
import java.util.Scanner;

public class question {

    static int countConsonants(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                count++;
            }
        }
        return count;
    }

    static void convertToUpper(String s){
        String result = "";
        int a = 'a';
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            } 
            result = result + ch;
        }
        System.out.println("Convert to upper case : " + result);
    }

    static int frequencyOfChar(String s,char character){
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == character){
                count++;
            }
        }
        return count;
    }

    static int countWords(String s){
        int count = 0;
        String[] words = s.split(" ");
        for(String val:words){
            count++;
        }
        return count;
    }
    static void main(){
        String str = "aqdas";
        System.out.println("Count total contrants in the String : " + countConsonants(str));

        convertToUpper(str);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char character = sc.next().charAt(0);
        System.out.println("Total character of " + character + " is : " + frequencyOfChar(str, character));


        String name = "  aqdas   ";
        System.out.println(name.trim());

        sc.nextLine();

        System.out.print("Enter the sentence : ");
        String str1 = sc.nextLine();
        System.out.println("Total words in a sentence : " + countWords(str1));
    }
}
