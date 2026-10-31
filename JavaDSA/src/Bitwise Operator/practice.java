public class practice {
    static void main() {
        int n = 5;
        //* even or odd
        if ((n & 1) == 1) {
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }

        //* multiply by 2
        System.out.println(n<<1);

        //* power of 2
        int n1 = 8;
        if ((n1 & (n1 - 1)) == 0) {
            System.out.println("is a power of 2");
        }
        else{
            System.out.println("is not power of 2");
        }
        //or
        int count = 0;
        while(n!=0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        System.out.println("Bit count: " + count);

    }
}
