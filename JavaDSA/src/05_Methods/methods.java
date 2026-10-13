public class methods{
    static void Print2Table(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(2*i);
        }
    }

    static int printSum(int x, int y){
        int add = x+y;
        return add;
    }

    static float printSum(int x,int y,int z){
        int add = x+y+z;
        return add;
    }

    static int multiplyNumber(int n,int y){
        int mult = n*y;
        return mult;
    }


    static void main() {
        System.out.println("Table of 2");
        Print2Table(); //function calling


        System.out.println("Sum of two number"+ printSum(5, 10)); //arguments 
        //example of method overloading
        System.out.println("sum:"+printSum(2, 5, 1));

        System.out.println("Multiply : "+multiplyNumber(3, 2));
    }
}