public class Helicopter extends Vehicle {

    private int avgAltitude;

    public Helicopter(String name, double cost, String transportationMode, int seatingCapacity, int avgAltitude) {
        super(name, cost, transportationMode, seatingCapacity);
        this.avgAltitude = avgAltitude;
    }

    public int checkAltitude() {
        return this.avgAltitude;
    }
}
