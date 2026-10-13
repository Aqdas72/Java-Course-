public class example {

    static void printWelcomeMessage(){
        System.out.println("Hello Everyone");
    }

    static int add(int a,int b){
        int sum = a+b;
        return sum;
    }

    static Boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }

    static int getMax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    static float calculatePercentage(float  obtained,float total){
        float percentage = obtained/total*100;
        return percentage;
    }

    static void display(int age){
        System.out.println("Age :"+age);
    }

    static void display(String name){
        System.out.println("Name : "+name);
    }


    static void updateValue(int x){
        x = x*10;
        System.out.println("Inside updateValue : "+x);
    }
    public static void main(String[] args) {
        //1.
        printWelcomeMessage();

        //2.
        System.out.println("Sum : "+ add(12, 5));

        //3.
        System.out.println(isEven(13));

        //4. 
        System.out.println("Greater Number :" + getMax(12, 24));

        //5.
        System.out.println("Percentage :" + calculatePercentage(234, 350) + "%");

        //6.
        display(21);
        display("Aqdas");

        //6.
        int x = 2;
        System.out.println("Inside main : "+x);
        updateValue(x);
        System.out.println("Inside main : "+x);


    }
}
