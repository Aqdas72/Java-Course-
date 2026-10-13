public class commonStringMethods {
    static void main() {
        String str = "Hello Aqdas";
        String str2 = "HELLO AQDAS";
        System.out.println(str.charAt(3));
        System.out.println(str.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));

        System.out.println(str.substring(0,4));
        System.out.println(str.contains("Aqdas"));

        String name = " AQdas   ";
        name = name.trim(); //trims the extra spaces
        System.out.println(name);

        String str3 = "  ";
        System.out.println(str3.isBlank());


        //split();

        String name2 = "Hello aqdas how are you";
        String[] str4 = name2.split(" ");
        for(String val:str4){
            System.out.println(val);
        }
    }
}
