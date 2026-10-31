

public class first {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a & b);//4
        System.out.println(a | b);//7

        //* XOR(^) same - 0 diff - 1
        System.out.println(a^b);//3

        //* NOT(~)
        System.out.println(~a);

        //* left shift(<<)
        System.out.println(a<<1);
        int n =100;
        /*for(int i=0;i<32;i++){
            n = n<<1;
            System.out.println(n); 
        }*/

        //* Right shift(>>)
        System.out.println(n>>1);
    }
}
