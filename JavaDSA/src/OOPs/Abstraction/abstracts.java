

public class abstracts {
    abstract class Bird {
    abstract void eat();  // Abstract method (no body)

    void sleep() {        // Non-abstract method (has body)
        System.out.println("Bird is sleeping");
    }

    //abstract int age;  //Invalid
    } 

    class Sparrow extends Bird{
        void eat(){
            System.out.println("sparrow is eating");
        }
    }
    class crow extends Bird{
        void eat(){
            System.out.println("crow is eating");
        }
    }


    public void doBirdStuff(Bird b){
        b.eat();
        b.sleep();
    }

    public void main(String[] args) {
        // Abstract class cannot be instantiated
        // AbstractClass obj = new AbstractClass(); // This will give an error

        // We can create a reference of abstract class
        doBirdStuff(new Sparrow());
        doBirdStuff(new crow());

    }
}
