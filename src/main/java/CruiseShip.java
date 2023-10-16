import java.util.ArrayList;

public class CruiseShip extends Vehicle {
    private boolean diningAvailable;
    private ArrayList<String> activities;

    public CruiseShip(String name, double cost, String transportationMode, int seatingCapacity, boolean diningAvailable) {
        super(name, cost, transportationMode, seatingCapacity);
        this.diningAvailable = diningAvailable;
        this.activities = new ArrayList<>();
    }

    public boolean checkDining() {
        return this.diningAvailable;
    }

    public int countActivities(){
        return this.activities.size();
    }
    public void addActivity(String activity) {
        this.activities.add(activity);
    }
}
