public class Dog extends Animal{

    private int eyes;
    private  int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int weight,int eyes,int legs,int tail,int teeth,String coat) {
        super(name, 1, 1, weight);
        this.eyes =eyes;
        this.legs = legs;
        this.teeth=teeth;
        this.coat=coat;
    }

    @Override
    public void eat() {
        System.out.println("dog.eat called ");
        chew();
        super.eat();
    }

    private void chew(){
        System.out.println("dog is chewing called");
    }
    @Override
    public void move(){
        System.out.println("called in the dog class");
        super.move();
    }
    public static void main(String[]args){
        Animal animal = new Animal("Animal",1,1,1);

        Dog dog = new Dog("bingo",56,2,2,1,32,"silk");
        //dog.eat();
        dog.move();
    }
}
