public class calculator{

    //* Compile time polymorphism
    int add(int a,int b){
        return a+b;
    }

    //method overloading --> add
    int add(int a,int b,int c){
        return a+b+c;
    }

    //* Runtime polymorphism

    class shape{
        void draw(){
            System.out.println("Shape is drawing...");
        }
    }

    class circle extends shape{
        @Override 
        void draw(){ //draw is polymorphic 
            System.out.println("circle is drawing...");
        }
    }

    class rect extends shape{
        @Override 
        void draw(){
            System.out.println("react is drawing...");
        }
    }
    public void main(String[] args) {
        //? Compile Time polymorphism
        calculator c = new calculator();
        System.out.println(c.add(1, 2));
        c.add(2, 4, 1);

        //? Runtime polymorphism
        circle C = new circle();
        C.draw();

        shape r = new shape();
        r.draw();

    }
}