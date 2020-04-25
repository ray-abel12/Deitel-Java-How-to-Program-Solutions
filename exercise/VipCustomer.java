public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer(){
  this("name",0.00d,"default");
    }
    public VipCustomer(String name ,double creditLimit){
      this(name,creditLimit,"unknown");
    }
    public VipCustomer(String name,double creditLimit,String emailAddress){
        this.name =name;
        this.creditLimit =creditLimit;
        this.emailAddress =emailAddress;
    }
    public static  void main(String[] args){
        VipCustomer vip = new VipCustomer();
        System.out.println(vip.getName());

        VipCustomer person2 = new VipCustomer("abel",12.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("john",12.000,"ray@gmail.com");
        System.out.println(person3.getName());
    }
}
