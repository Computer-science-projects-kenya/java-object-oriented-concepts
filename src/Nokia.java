/**
 * Created by Amuri on 4/17/2018.
 */
public class Nokia extends Phone{
    //Constructor to set properties/characteristics of object
    public Nokia(String manufacturer, String operating_system, String model, int cost) {
        super(manufacturer, operating_system, model, cost);
    }

    //Method to get access Model property of Object
    public String getModel(){
        return "This is Nokia Mobile- " + model;
    }
}
