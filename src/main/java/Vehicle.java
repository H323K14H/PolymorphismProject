public abstract class Vehicle {
    private String name;
    private double cost;
    private String transportationMode;
    private int seatingCapacity;

    public Vehicle(String name, double cost, String transportationMode, int seatingCapacity) {
        this.name = name;
        this.cost = cost;
        this.transportationMode = transportationMode;
        this.seatingCapacity = seatingCapacity;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    public String getTransportationMode() {
        return this.transportationMode;
    }

    public int getSeatingCapacity() {
        return this.seatingCapacity;
    }
}
