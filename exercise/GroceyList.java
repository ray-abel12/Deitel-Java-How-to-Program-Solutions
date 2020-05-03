import java.util.ArrayList;

public class GroceyList {

    private static ArrayList<String> groceyList = new ArrayList<String>();

    public  void addGroceyList(String iteam){
        groceyList.add(iteam);

    }
    public void printGroceyList(){
        System.out.println("you have "+groceyList.size()+"items in your grocey List");
        for(int i =0;i<groceyList.size();i++){
            System.out.println((i+1)+". "+ groceyList.get(i));
        }
    }
    public void modifyGroceyiteam(int postion,String newIteam){
        groceyList.set(postion,newIteam);
        System.out.println("Grocey iteam "+(postion+1) + "has being modified");
    }
    public void removeGroceyIteam(int postion){
        String item = groceyList.get(postion);
        groceyList.remove(postion);
        System.out.println("grocery iteam at "+(postion+1)+" hs being removed.");
    }
    public static void main(String[] args){
        addGroceyList("bread");

    }
}
