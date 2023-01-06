public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        iPhone.setName("iPhone 13");

        System.out.println(iPhone.getName());
        iPhone.playMusic("My Home");

        Bird phoenix = new Bird("Nina", "Golden", 2, true, 2);
        phoenix.eat("meat");
        System.out.println(phoenix.getName());
        System.out.println(phoenix.getWings());
        phoenix.fly();
        phoenix.fly(100);
    }
}