package enumeration;

public class LightChanger {

    public static void main(String[] args) {
        Light light = new Light();
        light.changeLight(StopLight.GREEN);
        light.changeLight(StopLight.YELLOW);
        light.changeLight(StopLight.RED);
    }
}
