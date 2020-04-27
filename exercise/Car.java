public class Car extends Vehicle {

    private int doors;
    private int wheels;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String type, String name, int doors, int wheels, int gears, boolean isManual) {
        super(type, name);
        this.doors = doors;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }
    public void changeGear(int currentGear){
        this.currentGear =currentGear;
        System.out.println("car.setCurrent gear()changed to "+currentGear);
    }
    public void changeVelocity(int speed,int direction){
        move(speed,direction);
        System.out.println("vehcle.changeVelocity  speed"+speed+"direction" + direction);
    }
    public void stop(){
        System.out.println("car.stop");
    }
}
