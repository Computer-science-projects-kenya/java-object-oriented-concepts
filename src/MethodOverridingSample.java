/**
 * Created by Amuri on 4/26/2018.
 */
public class MethodOverridingSample {
    public static void main(String[] args) {

        //Lets create an  Object of SuperClass(Phone) and call getModel,getManufacturer Methods
        Phone simu1=new Phone("Sony","Android","Sony Xperia",15000);

        System.out.println(simu1.getModel());
        System.out.println(simu1.getManufacturer());
        System.out.println(simu1.getOperating_system());
        System.out.println(simu1.getCost());

        //Lets create an  Object of Subclass and call several methods
        Nokia simu2=new Nokia("Nokia","Windows","Lumia",10000);
        System.out.println(simu2.getModel());
        System.out.println(simu2.getManufacturer());
        System.out.println(simu2.getOperating_system());
        System.out.println(simu2.getCost());


        //Lets create an  Object of Subclass and call several methods
        Iphone simu3=new Iphone("Apple","iOS","Iphone 6",100000);
        System.out.println(simu3.getModel());
        System.out.println(simu3.getManufacturer());
        System.out.println(simu3.getOperating_system());
        System.out.println(simu3.getCost());

    }
}
