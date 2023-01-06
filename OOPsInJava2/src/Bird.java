public class Bird extends Animal {

    private int wings;

    public Bird(String name, String color, int legs, boolean hasTail, int wings) {
        super(name, color, legs, hasTail);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void fly()
    {
        System.out.println(this.getName()+" is flying.");
    }
    // polymorphism
    public void fly(int speed)
    {
        System.out.println(this.getName()+" is flying. with speed: "+ speed);
    }

    // Overriding: changing paren behavior: ctrl + o

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println(this.getName()+" finished eating");
    }
}

