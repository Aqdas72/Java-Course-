package Encapsulation;
public class encapsulation {
    //attributes
    private String name;
    private int age;

    //default const
    encapsulation() {
        name = "aqdas";
    }

    //parameterized const
    encapsulation(String name,int age) {
        this.name = name;
        this.age = age;
    }


    void sleep(){
        System.out.println(name + "sleeping");
    }

    public static void main(String[] args) {
        encapsulation e1 = new encapsulation();
        encapsulation e2 = new encapsulation("hello", 12);
        e2.name = "twinkle";
        System.out.println(e2.name);
        e2.sleep();
        e1.sleep(); //*same class

        System.out.println("\n");
        System.out.println("FROM STUDENT CLASS");
        student s4 = new student(12, 13, "ayan", "btech",11);//another class
        s4.sleep();
        System.out.println(s4.name);

        //* System.out.println(s4.roll);//roll have a private keyword so it cannot be access from another class
        //for this thing we use getter or setter
        System.out.println("getting value using getter: " + s4.getRoll());
        //setting a roll
        s4.setRoll(13);
        System.out.println("after changing value using setter method: " + s4.getRoll());
    }
}
