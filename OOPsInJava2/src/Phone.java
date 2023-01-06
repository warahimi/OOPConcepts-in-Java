public class Phone {
    private String name; // public is the default access modifier if we do not specify
    private int screenSize;
    private int memoryRam;
    private int camera;

    // Having different type of constructors is a good example of polymorphism
    public  Phone()
    {

    }
    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    public Phone(String name, int screenSize) {
        this.name = name;
        this.screenSize = screenSize;
    }

    public void playMusic(String track)
    {
        System.out.println("Playing: "+track);
    }

    // Getters and Setter: we use them for encapsulation purposes
    // we limit the user's access and operations , for example make fild read only by just creating getters
    // or we can perform some operations in getters and setters
    // for example validate the user's input before setting them to our fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
