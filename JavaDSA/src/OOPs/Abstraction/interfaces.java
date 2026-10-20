
public class interfaces {
    interface Bird{
        void sound(); // abstract method and it is bydefault public

        void sleep();
    }
    class Sparrow implements Bird{
        public void sound(){
            System.out.println("sparrow making the sound");
        }
        public void sleep(){
            System.out.println("sparrow is sleeping");
        }
    }

    public void doBirdStuff(Bird b){
        b.sound();
        b.sleep();
    }

    public void main(String[] args) {
        doBirdStuff(new Sparrow());
    }
}
