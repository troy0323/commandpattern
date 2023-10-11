package commandPattern;

public class TempUp implements Command{
    private Thermostat thermostat;

    public TempUp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        String message = thermostat.tempUp();
        System.out.println("Temperature: " + message+ "");
        return message;

    }
}
