public class forloops{
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }

        // Nested for loop
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}