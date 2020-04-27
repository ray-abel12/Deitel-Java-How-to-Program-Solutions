public class Case {
    private String power;

    public Case(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }
    public void powerOn(String on){
        System.out.println("powering up");
    }
}
