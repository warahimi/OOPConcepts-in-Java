import Composition_In_OOPs.Car;
import Composition_In_OOPs.Engine;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car mercedes = new Car("Mercides AMG",4,"red", new Engine("Renauld",7000));
        System.out.println(mercedes.getName());
        System.out.println(mercedes.getEngine().getModel());

        Car toyota = null;
        //System.out.println(toyota.getColor()); // no operation can be performed on null objects
        if(toyota != null)
        {
            System.out.println(toyota.getColor());
        }
        else
        {
            System.out.println("Objes was null");
        }

        final  int age =24;
        // age = 44;

        final Engine en = new Engine("Toyota", 4000);

        // we cannot change final varaibel
        //en = new Engine("xx", 555);

        // we cannot change the whole instance of a final object but we can change the properties of the final object

        en.setModel("ttt");



    }
}