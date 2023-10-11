package commandPattern;

public class ThermosOff implements Command{

    private Thermostat thermostat;

    public ThermosOff(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.switchOff();
    }
}