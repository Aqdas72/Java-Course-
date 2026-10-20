public class Inheritance {

    public static class Vehicle{
        //properties
        String name;
        String model;
        int noOfTyres;

        //Vehicle(parent class) --> parameterized constructor
        Vehicle(String name,String model,int noOfTyres) {
            this.name = name;
            this.model = model;
            this.noOfTyres = noOfTyres;
        }

        //behaviours
        void startEngine(){
            System.out.println("Engine is starting of " + name + model);
        }

        void stopEngine(){
            System.out.println("Engine is stopped of " + name + model);
        }
    }

    public static class car extends Vehicle{
        int noOfDoors;
        String transmissionType;

        //car(child class) --> constructor
        car(String name,String model,int noOfTyres,int noOfDoors,String transmissionType){
            super(name, model, noOfTyres);//refer to the instance of immediate parent
            this.transmissionType = transmissionType;
            this.noOfDoors = noOfDoors;
        }
        
        void displayCarDetails(){
            System.out.println("Car Name: " + name);
            System.out.println("Car Model: " + model);
            System.out.println("No of Tyres: " + noOfTyres);
            System.out.println("No of Doors: " + noOfDoors);
            System.out.println("Transmission Type: " + transmissionType);
        }
    }

    public static class bike extends Vehicle{
        boolean hasCarrier;

        //bike(child class) --> constructor
        bike(String name,String model,int noOfTyres,boolean hasCarrier){
            super(name, model, noOfTyres);
            this.hasCarrier = hasCarrier;
        }

        void displayBikeDetails(){
            System.out.println("Bike Name: " + name);
            System.out.println("Bike Model: " + model);
            System.out.println("No of Tyres: " + noOfTyres);
            System.out.println("Has Carrier: " + hasCarrier);
        }
    }

    public static void main(String[] args) {
        car c = new car("Toyota", "Camry", 4, 4, "Automatic");
        c.startEngine();
        c.displayCarDetails();
        c.stopEngine();

        System.out.println("\n");
        bike b = new bike("Yamaha", "R15", 2, true);
        b.startEngine();
        b.displayBikeDetails();
        b.stopEngine();
    }
}
