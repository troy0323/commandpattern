package commandPattern;

public class ThermosOn implements Command {
    private Thermostat thermostat;

    public ThermosOn(Thermostat thermostat) {
        this.thermostat = thermostat;

    }

    @Override
    public String execute() {
        return thermostat.switchOn();
    }
}