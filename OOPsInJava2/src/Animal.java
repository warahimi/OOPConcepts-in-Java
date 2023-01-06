/*
    We basically pull out all the children common functionalities and properties to the supper class
    in order to avoid code repeatation.
    we can customize our child class by chaning the inherited properites or by adding extra
    behavior or property.
    we can change the behavior our parent class inside the child class
* */
public class Animal {
    private String name;
    private String color;
    private int legs;

    private boolean hasTail;

    public Animal(String name, String color, int legs, boolean hasTail) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTail = hasTail;
    }

    // Getters and Setters : alt+insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public void eat(String food)
    {
        System.out.println("Eating: "+ food);
    }
}
