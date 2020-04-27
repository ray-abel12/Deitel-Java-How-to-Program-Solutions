public class Pc {
    private Monitor monitor;
    private MotherBoard motherBoard;
    private Case aCase;

    public Pc(Monitor monitor, MotherBoard motherBoard, Case aCase) {
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.aCase = aCase;
    }

     public void powerUp(){
        aCase.powerOn("on");
        drawLogo();
        loadProgram();
     }
     public void drawLogo(){
        monitor.draw(12,15);
     }
     public void loadProgram(){
        motherBoard.LoadProgram("win10");
     }

}
