class Jaws extends Movie{
public Jaws(){
    super("jaws");
}
public String Plot(){
    return "A shake eat alot of people";
}
}
class IndependenceDay extends  Movie{
    public IndependenceDay(){
        super("indepenceDay");
    }

   /* public String plot(){
        return "Aliens attempt to take over Earth";
    }*/
}
class Maze extends Movie{
    public Maze(){
        super("Maze");
    }
  @Override
  public String plot(){
        return " trying to escape a maze";
  }
}
class StarWars extends Movie{
    public StarWars(){
        super("starWars");
    }
    @Override
    public  String plot(){
        return "imperial force try to take over the world";
    }
}




public class Main
{
    public static void main(String[] args){
for(int i = 0;i<10;i++){
    Movie movie =randomMovie();
    System.out.println("movies"+ i+movie.getName()
    + movie.plot());
}
    }



public static Movie randomMovie(){
    int randomNumber = (int)(Math.random()*4)+1;
    System.out.println("Random number generated is"+randomNumber);
    switch (randomNumber) {
        case 1:
            return new Jaws();

        case 2:
            return new IndependenceDay();

        case 3:
            return new Maze();

        case 4:
            return new StarWars();
    }
    return null;
}
}
