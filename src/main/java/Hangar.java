import java.util.ArrayList;

public class Hangar {
    private String name;
    private ArrayList<Vehicle> vehicles;

    public Hangar(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int countVehicles(){
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }


}
