package JavaCollectionFramework.List;

public class stacks {
    public static void main(String[] args) {
        //*Stack implements the List interface

        //? Create a stack
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        //? Push elements onto the stack
        stack.push(10);
        stack.add(13);//we can also do this
        stack.push(20);
        stack.push(30);

        //? Display the stack
        System.out.println("Stack: " + stack);

        //? Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        //? Display the stack after popping
        System.out.println("Stack after popping: " + stack);

        //? Peek at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        //? Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);
    }
    
}
