/**
 * Created by Amuri on 4/16/2018.
 */
public class Mobile {
    private String manufacturer;
    private String operating_system;
    public String model;
    private int cost;
    //Constructor to set properties/characteristics of object

    public Mobile(String manufacturer, String operating_system, String model, int cost) {
        this.manufacturer = manufacturer;
        this.operating_system = operating_system;
        this.model = model;
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public String getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }
}
