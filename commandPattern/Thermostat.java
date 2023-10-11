package commandPattern;

public class Thermostat {
    private int tempLevel= 28;

    public String switchOn() {
        return "Thermostat is switched on!";

    }

    public String switchOff() {
        return "Thermostat is switched off!";

    }

    public String tempUp() {
        tempLevel++;
        return "Temperature: " + tempLevel+"°C";
    }

    public String tempDown() {
        if (tempLevel > 0) {
            tempLevel--;
        }
        return "Temperature: " + tempLevel+"°C";
    }

}


