public class practice {
    static void main(){
        //*1. print each character of the string

        String str = "Aqdas";
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }


        //*2. count length of string without length()
        String greet = "Hello";

        char[] words = greet.toCharArray();
        System.out.println("String length is : "+words.length);


        //*3. count vowels in string
        String name = "aqdas";
        int count = 0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("Total vowels in string : " + count);

        //*4 Reverse a string
        String rev = "hello";

        //? basic approach
        String reverse = "";
        for(int i=rev.length()-1;i>=0;i--){
            char ch=rev.charAt(i);
            reverse = reverse + ch; //concetenation
        }
        System.out.println(reverse);


        //? can we use ischarArray() --> array --> reverse --> valueOf()
        char[] ch = rev.toCharArray();
        /*int start =0;
        int end = ch.length-1;
        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }*/
        String revString = String.valueOf(ch);
        System.out.println(revString);

        //? using process StringBuilder
        StringBuilder sb = new StringBuilder("aqdas");
        sb.reverse();
        System.out.println(sb);


        //*5. check string is palindrome or not
        String str2 = "amma";
        int n = str2.length();
        int j = n-1;
        for(int i=0;i<n;i++){
            if(str2.charAt(i) != str2.charAt(j)){
                System.out.println("not a palindrome");
                return;
            }else{
                j--;
            }
        }
        System.out.println("is palindrome");

    }
}
