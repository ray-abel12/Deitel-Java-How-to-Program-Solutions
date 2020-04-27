public class Funitures {
    private int chairs;
    private int bed;
    private int roge;
    private int table;

    public Funitures(int chairs, int bed, int roge, int table) {
        this.chairs = chairs;
        this.bed = bed;
        this.roge = roge;
        this.table = table;
    }

    public int getChairs() {
        return chairs;
    }

    public int getBed() {
        return bed;
    }

    public int getRoge() {
        return roge;
    }

    public int getTable() {
        return table;
    }
    public void read(){
        System.out.println("reading on the table");
    }
    public void sleep(){
        System.out.println("sleeping o the bed ");
    }
}
