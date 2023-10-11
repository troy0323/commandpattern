package commandPattern;

public class Lights {

    private int brightnessLevel = 0;

    public String switchOn() {
        return "Lights is switched on!";
    }

    public String switchOff() {
        return "Lights is switched off!";
    }

    public String brightUp() {
        brightnessLevel++;
        return "Brightness: " + brightnessLevel;
    }

    public String brightDown() {
        if (brightnessLevel > 0) {
            brightnessLevel--;
        }
        return "Brightness: " + brightnessLevel;
    }

}
