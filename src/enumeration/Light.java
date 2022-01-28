package enumeration;

public class Light {
    public Light() {
    }

    public void changeLight(StopLight currentLight) {
        if (currentLight == StopLight.GREEN) {
            System.out.println("Green means go");
        } else if (currentLight == StopLight.YELLOW) {
            System.out.println("Yellow means slow down");
        } else if (currentLight == StopLight.RED) {
            System.out.println("Red means stop");
        }
    }
}
