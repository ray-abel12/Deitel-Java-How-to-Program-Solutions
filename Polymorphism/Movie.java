public class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "base class no plot here";
    }

    public String getName() {
        return name;
    }
}
