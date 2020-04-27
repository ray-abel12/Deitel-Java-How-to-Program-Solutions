public class Main {

    public static void main(String[] args){

       MotherBoard theMotherBoard = new MotherBoard("hp","2",new Dimensions(12,15));
       Monitor theMonitor = new Monitor(12,54);
       Case cas = new Case("on");
       Pc pc = new Pc(theMonitor,theMotherBoard,cas);
      pc.powerUp();
      pc.loadProgram();
    }
}
