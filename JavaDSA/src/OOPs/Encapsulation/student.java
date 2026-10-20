package Encapsulation;
public class student {
        // properties/attributes of a class
        int age;
        int id;
        public String name;
        String course;
        private int roll;

        //* default constructor
        public student() {
            System.out.println("default constructor called");
        }

        //* parameterized constructer func
        public student(int age, int id, String name, String course,int roll) {
            this.age = age;
            this.id = id;
            this.name = name;
            this.course = course;
            this.roll = roll;
        }

        //* copy constructor
        public student(student stu){
            this.age = stu.age;
            this.id = stu.id;
            this.name = stu.name;
            this.course = stu.course;
            this.roll = roll;
        }

        //* behavior of a class
        public void sleep() {
            System.out.println(name + " sleeping");
        }

        public void course() {
            System.out.println("course name : " + course);
        }

        //* getter setter
        public int getRoll(){
            return roll;
        }

        public void setRoll(int r){
            this.roll = r;
        }

    public static void main(String[] args) {
        student s1 = new student(20, 1, "Alice", "Java",12);

        student s2 = new student();
        s2.name = "Aqdas";
        s2.course = "Java";

        student s3 = new student(s1);
        s3.sleep();
    }
}
