package commandPattern;

public class VolumeDown implements Command{
    private MusicPlayer musicPlayer;

    public VolumeDown(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        String message = musicPlayer.volumeDown();
        System.out.println("Volume down: " + message);
        return message;
    }
}


