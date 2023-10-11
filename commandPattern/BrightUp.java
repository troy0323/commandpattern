package commandPattern;

public class BrightUp implements Command {

    private Lights lights;

    public BrightUp(Lights lights) {
        this.lights = lights;
    }

    @Override
    public String execute() {
        String message = lights.brightUp();
        System.out.println("Brightness: " + message);
        return message;
    }
}

