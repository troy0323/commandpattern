package commandPattern;

public class MusicOn implements Command{

    private MusicPlayer musicPlayer;

    public MusicOn(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;

    }
    @Override
    public String execute() {
        return musicPlayer.switchOn();
    }
}
