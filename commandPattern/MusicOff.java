package commandPattern;

public class MusicOff implements Command {

    private MusicPlayer musicPlayer;

    public MusicOff(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.switchOff();

    }
}