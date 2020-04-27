

public class MotherBoard {
    private String manufacturer;
    private String ramSlot;
    private Dimensions dimensions;

    public MotherBoard(String manufacturer, String ramSlot, Dimensions dimensions) {
        this.manufacturer = manufacturer;
        this.ramSlot = ramSlot;
        this.dimensions = dimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getRamSlot() {
        return ramSlot;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
    public void LoadProgram(String program){
        System.out.println("the loaded program is"+program);
    }
}
