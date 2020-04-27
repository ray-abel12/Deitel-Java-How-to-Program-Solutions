public class staticTest {

    public static String name;

    public staticTest(String name) {
        staticTest.name = name;
    }
        public void printName(){
            System.out.println(name);
        }


    public static void main(String[] args){
        staticTest test = new staticTest("rex");
        staticTest test2 = new staticTest("pin");
        test.printName();
        test2.printName();
    }
}
