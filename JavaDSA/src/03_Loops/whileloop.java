public class whileloop {
    public static void main(String[] args) {
        int i = 0; //Initialize
        while (i < 5) { //Condition
            System.out.println("The value of i is: " + i);
            i++; //Increment
        }

        //do while loop --> atleast execute once
        int j = 5; //Initialize
        do {
            System.out.println("The value of j is: " + j);
            j++; //Increment
        } while (j < 5); //Condition
    }
}
