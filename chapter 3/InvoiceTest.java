package exercises;
import java.util.Scanner;

 public class InvoiceTest {
    public static void main (String [] args) {
 
 Invoice invoice = new Invoice (" ", " ", 0, 0.0);
 
 Scanner input = new Scanner (System.in);
         
        String item;
        String description;
        int quantity;
        double price;
         
        System.out.print ("Enter Number: ");
        item = input.nextLine();
        invoice.setPartNumber(item);
         
        System.out.print ("Enter Description of Item Purchased: ");
        description = input.nextLine();
        invoice.setPartDescription(description);
         
        System.out.print ("Enter The Quantity of Item Purchased: ");
        quantity = input.nextInt();
    if (quantity > 0)
        invoice.setQuantityOfItemPurchased(quantity);
         
        System.out.print ("Enter The Price Per Item: ");
        price = input.nextDouble();
    if (price > 0)
        invoice.setPricePerItem (price);
         
        System.out.printf ("The Total Amount for all items purchased = $%.2f\n",
                invoice.getInvoiceAmount());
        input.close();
 
    }
}

