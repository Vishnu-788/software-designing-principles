package patterns;

class ClassicPlayer {
    public void playAudio(String text) {
        System.out.println("Playing Audio");
    }
}

interface Player {
    public void play(String text);
}

class ModernPlayer extends ClassicPlayer implements Player {

    @Override
    public void play(String text) {
        if(text.contains("mp3")) {
            playAudio(text);
        }
        if(text.contains("mp4")) {
            System.out.println("playing video...");
        }
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        ModernPlayer player = new ModernPlayer();
        player.play("Kantara.mp3");
    }
}

