package exercises;


	public class Invoice {
	    
	    private String partNumber;
	    private String partDescription;
	    private int quantityOfItemPurchased;
	    private double pricePerItem;
	     
	    public Invoice (String number, String description, int quantity, double price) {
	        partNumber = number;
	        partDescription = description;
	        quantityOfItemPurchased = quantity;
	        pricePerItem = price;
	    }
	     
	    public void setPartNumber (String number) {
	        this.partNumber = number;
	    }
	     
	    public String getPartNumber () {
	        return partNumber;
	    }
	     
	    public void setPartDescription (String description) {
	        partDescription = description;
	    }
	     
	    public String getPartDescription () {
	        return partDescription;
	    }
	     
	    public void setQuantityOfItemPurchased (int quantity) {
	        quantityOfItemPurchased = quantity;
	    }
	     
	    public int getQuantityOfItemPurchased () {
	        return quantityOfItemPurchased;
	    }
	     
	    public void setPricePerItem (double price) {
	        pricePerItem = price;
	    }
	     
	    public double getPricePerItem () {
	        return pricePerItem;
	    }
	     
	    public double getInvoiceAmount () {
	        double calculateTotalAmount;
	        calculateTotalAmount = quantityOfItemPurchased * pricePerItem;
	        return calculateTotalAmount;
	    }
	     
	 }


