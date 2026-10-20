public class practice {

    static void printAllDigits(int num){
        //cond --> n=0 
        //jbtk n!=0 tbtk print krwaenge

        while(num != 0){
            int digit = num%10;
            System.out.println(digit);
            //remove the last digit
            num = num/10;
        }
    }

    static void countDigit(int num){
        int count = 0;
        while(num != 0){
            num = num/10;
            count++;
        }
        System.out.println("count : "+count);
    }

    static void sumOfDigit(int num){
        int sum = 0;
        while(num != 0){
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
        System.out.println("sum: "+sum);
    }

    static int reverseNumber(int num){
        int ans = 0;

        while(num != 0){
            int digit = num%10;
            ans = (ans*10) + digit;
            num = num/10;            
        }
        return ans;
    }

    static void isPalindrome(int num){
        int original = num;
        int reverse = reverseNumber(num);
        if(original == reverse){
            System.out.println("Is palindrome");
        } else{
            System.out.println("Is not a palindrome");
        }
    }


    static void isPrimeNumber(int number){
        boolean isPrime = true;
        if(number <= 1){
            isPrime = false;
            System.out.println(isPrime);
        } else{
            for(int i=2;i*i<=number;i++){
                if(number%i == 0 &&  number%1==0){
                    isPrime = false;
                    System.out.println(isPrime);
                    return;
                } 
            }
            System.out.println(isPrime);
        }
    }

    static void findGCD(int a,int b){
        //formula -> gcd(a,b) = gcd(b,a%b)
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("GCD of these two number is :" + a);
    }

    static void getLCM(int a,int b){
        int ans=a*b;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int result = ans/a;
        System.out.println("LCM : " + result);
    }

    static boolean isArmstrong(int num){
        int originalNumber = num;
        int sum = 0;
        while(num != 0){
            int digit = num%10;
            sum = sum + (digit*digit*digit);
            num = num/10;
        }
        if(sum == originalNumber){
            return true;
        } else{
            return false;
        }
    }

    static void isPerfect(int num){
        int originalNumber = num;
        int sum = 0;
        for(int i=1;i<num/2;i++){
            if((num%i) == 0){
                sum = sum + i;
            }
        }
        if(sum == originalNumber && num>1){
            System.out.println("Perfect number");
        } else{
            System.out.println("Not a perfect number");
        }
    }

    public static void main(String[] args) {
        int num = 52378;
        printAllDigits(num);

        countDigit(num);
        sumOfDigit(num);

        System.out.println(reverseNumber(num));
        isPalindrome(num);

        int isprime = 21;
        isPrimeNumber(isprime);

        //*GCD
        findGCD(18, 12);

        //*LCM
        getLCM(12, 6);

        //*Armstrong number
        System.out.println(isArmstrong(125));

        //* perfect number
        isPerfect(7);

    }
}
