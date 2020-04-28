public class Car {
    public String name;
    public boolean engine;
    public int doors;
    public int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.doors = 4;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car-->startEngine";
    }

    public String accelerate() {
        return "Car-->Accelerate";
    }

    public String brake() {
        return "Car-->Brake";
    }
}
class Toyota extends Car{
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Toyota-->StartEngine";
    }

    @Override
    public String accelerate() {
        return "Toyota-->Accelerate";
    }

    @Override
    public String brake() {
        return "Toyota-->brake";
    }
    public static void main(String[] args){
        Car car = new Car("Toyota",4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Toyota toyota = new Toyota("toyota",4);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());
    }
    }





