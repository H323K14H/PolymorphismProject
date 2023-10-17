import java.util.ArrayList;

public class Bicycle extends Vehicle {
    private int numberOfGears;
    private ArrayList<String> accessories;

    public Bicycle(String name, double cost, String transportationMode, int seatingCapacity, int numberOfGears) {
        super(name, cost, transportationMode, seatingCapacity);
        this.numberOfGears = numberOfGears;
        this.accessories = new ArrayList<>();
    }

    public int getNumberOfGears() {
        return this.numberOfGears;
    }

    public int countAccessories() {
        return this.accessories.size();
    }

    public void addAccessory(String accessory) {
        this.accessories.add(accessory);
    }

}
