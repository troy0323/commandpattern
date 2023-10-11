package commandPattern;

public class LightsOff implements Command {
    private Lights lights;

    public LightsOff(Lights lights) {
        this.lights = lights;
    }

    @Override
    public String execute() {
        return lights.switchOff();

    }
}

