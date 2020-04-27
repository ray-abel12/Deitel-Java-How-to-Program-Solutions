public class Animal {

    private String name;
    private int body;
    private int brain;
    private int weight;

    public Animal(String name, int body, int brain, int weight) {
        this.name = name;
        this.body = body;
        this.brain = brain;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("calling dog.eat from animal class");
    }
    public void move(){
        System.out.println("in Animsl class called");
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }
}
