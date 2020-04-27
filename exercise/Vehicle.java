public class Vehicle {
    private String name;
    private String type;

    private  int currentVelocity;
    private int currentDirection;


    public Vehicle(String type, String name) {
        this.type = type;
        this.name = name;

        this.currentVelocity =0;
        this.currentDirection=0;
    }

    public void  steer (int direction){
        this.currentDirection +=direction;
        System.out.println("vehicle class()"+direction);
    }
  public void move(int velocity,int direction){
        currentDirection = direction;
        currentVelocity = velocity;
      System.out.println("vehcle move() Moving at"+velocity+"speed and ,in "+direction+"direction");
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
