package interfaceExample;

public class Car implements Vehicle{
    private String speed;
    private String color;
    private String type;

    public Car(String speed, String color, String type) {
        super();
        this.speed = speed;
        this.color = color;
        this.type = type;
    }

    @Override
    public String getSpeed() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }
}
