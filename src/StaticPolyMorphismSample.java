/**
 * Created by Amuri on 4/24/2018.
 */
public class StaticPolyMorphismSample {

    public static void main(String[] args) {

        MethodOverloadSample obj = new MethodOverloadSample();

        obj.print(10);
        obj.print("Amit");
        obj.print("Hello", 100);
    }
}
