public class Printer {

    private int tonnerLevel;
    private int numberOfPagesPrinted =2;
    private boolean isDuplex;

    public Printer(int tonnerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        this.tonnerLevel = tonnerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }
    public int fillUpToner(){
      if(tonnerLevel < 100){
          tonnerLevel =100;
      }
      return tonnerLevel;
    }
    public int getNumberOfPagesPrinted(){
        if(isDuplex == true){
            numberOfPagesPrinted +=2;
        }
        else{
            numberOfPagesPrinted++;
        }
        return numberOfPagesPrinted;
    }

}
