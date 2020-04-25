public class ForLoop {

    public static void main(String[] args){
       // System.out.println(calculateInterset(10200.0,2.0));
        for (int i =2;i<=9;i++ ){
            System.out.println("10,000 at "+i+"% interest = "+ calculateInterset(10000.0,i));
        }
    }
    public static double calculateInterset(double amount,double interestRate){
       return(amount *interestRate/100) ;
    }
}
