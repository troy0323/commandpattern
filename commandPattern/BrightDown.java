package commandPattern;

public class BrightDown implements Command{
    private Lights lights;

    public BrightDown(Lights lights) {
        this.lights = lights;
    }

    @Override
    public String execute() {
        String message = lights.brightDown();
        System.out.println("Brightness: " + message);
        return message;
    }
}
