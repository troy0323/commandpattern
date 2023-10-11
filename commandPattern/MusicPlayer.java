package commandPattern;

public class MusicPlayer {

    private int volumeLevel = 0;

    public String switchOn() {
        return "Music Player is switched on!";

    }

    public String switchOff() {
        return "Music player is switched off!";

    }

    public String volumeUp() {
        volumeLevel++;
        return "Volume: " + volumeLevel;
    }

    public String volumeDown() {
        if (volumeLevel > 0) {
            volumeLevel--;
        }
        return "Volume: " + volumeLevel;
    }
    public String playList(){
        return playList();
    }
}

