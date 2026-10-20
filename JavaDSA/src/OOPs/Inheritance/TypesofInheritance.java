/*
 * Types of Inheritance in Java
1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance
4. Multiple Inheritance (through interfaces)
5. Hybrid Inheritance (combination of two or more types of inheritance)
 */
public class TypesofInheritance {
    //? 1. Single Inheritance
    class Animal{

        void eat(){
            System.out.println("Animal is eating");
        }
    }
    class Dog extends Animal{
        void Bark(){
            System.out.println("Dog is barking");
        }
    }

    //? 2. Multilevel Inheritance
    class puppy extends Dog{
        void weep(){
            System.out.println("weep weep");
        }
    }

    //? 3. Hierarchical Inheritance
    class Vehicle{ //parent class
        void start(){
            System.out.println("Vehicle is started");
        }
    }
    class car extends Vehicle{//childA
        void drive(){
            System.out.println("Car is driving");
        }
    }
    class bike extends Vehicle{//childB
        void ride(){
            System.out.println("bike is riding");
        }
    }

    //?4. Multiple Inheritance - java doesnot do it directly in java we do it by interface
    interface camera{
        void takePhoto();
    }
    interface musicPlayer{
        void playMusic();
    }
    class smartPhone implements camera,musicPlayer{
        @Override
        public void takePhoto(){
            System.out.println("taking photo");
        }
        @Override
        public void playMusic(){
            System.out.println("playing music");
        }
    }


    public void main(String[] args) {
        //*1
        System.out.println("Example of single Inheritance");
        Dog d = new Dog();
        d.eat();
        d.Bark();
        System.out.println("\n");

        //*2. Mutilevel Inheritance
        System.out.println("Multilevel Inheritance");
        puppy p = new puppy();
        p.eat();
        p.Bark();
        p.weep();
        System.out.println("\n");

        //*3. Hierarchical Inheritance
        System.out.println("Hierarchical Inheritance");
        car c = new car();
        c.drive();
        c.start();

        bike b = new bike();
        b.start();
        b.ride();

        smartPhone phone = new smartPhone();
        phone.takePhoto();
        phone.playMusic();
        System.out.println("\n");

        //*4. Multiple Inheritance
        smartPhone s = new smartPhone();
        s.playMusic();
        s.takePhoto();
    }
}
