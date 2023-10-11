package commandPattern;

public class VolumeUp implements Command {
    private MusicPlayer musicPlayer;

    public VolumeUp(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        String message = musicPlayer.volumeUp();
        System.out.println("Volume up: " + message);
        return message;
    }
}

