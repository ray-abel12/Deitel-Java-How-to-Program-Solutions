
public class Car {
    private int door;
    private int wheel;
    private String model;
    private String engine;
    private String color;

    public void setEngin(String engine){
        String validEngine = engine.toLowerCase();
        if((validEngine.equals("v8")) || (validEngine.equals("v4"))){
            this.engine = engine;
        }else{
            this.engine ="unknow";
        }

    }
    public String getEngine(){
        return this.engine;
    }

    public static void main(String[] args){
        Car porch = new Car();
        porch.setEngin("v2");
        System.out.println(porch.getEngine());


    }
}
