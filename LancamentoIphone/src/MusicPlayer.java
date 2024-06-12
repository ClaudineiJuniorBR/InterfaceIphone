public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

// Interfaces
public interface MusicPlayer {
    void play(Music music);

    void pause();

    void stop();
}

public interface Phone {
    void makeCall(String number);

    void receiveCall();

    void hangUp();
}

public interface InternetBrowser {
    void browse(String url);

    void goBack();

    void goForward();
}

// Classes
public class iPhone {
    private Screen screen;
    private Phone phone;
    private MusicPlayer musicPlayer;
    private InternetBrowser internetBrowser;

    public iPhone() {
        this.screen = new Screen();
        this.phone = new PhoneImpl();
        this.musicPlayer = new MusicPlayerImpl();
        this.internetBrowser = new InternetBrowserImpl();
    }

    public void playMusic(Music music) {
        musicPlayer.play(music);
    }

    public void makeCall(String number) {
        phone.makeCall(number);
    }

    public void browseInternet(String url) {
        internetBrowser.browse(url);
    }
}

public class Screen {
    private int width;
    private int height;
    private String resolution;

    public Screen() {
        // Inicializar a tela
    }

    public void display(Image image) {
        // Exibir a imagem na tela
    }

    public void display(String text) {
        // Exibir o texto na tela
    }
}

public class Music {
    private String title;
    private String artist;
    private int duration;

    public Music(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public void play() {
        // Reproduzir a música
    }

    public void pause() {
        // Pausar a música
    }

    public void stop() {
        // Parar a música
    }
}

public class Image {
    private int width;
    private int height;
    private byte[] data;

    public Image(int width, int height, byte[] data) {
        this.width = width;
        this.height = height;
        this.data = data;
    }
}

// Implementações das interfaces
public class PhoneImpl implements Phone {
    public void makeCall(String number) {
        // Implementar a lógica de fazer uma chamada
    }

    public void receiveCall() {
        // Implementar a lógica de receber uma chamada
    }

    public void hangUp() {
        // Implementar a lógica de desligar uma chamada
    }
}

public class MusicPlayerImpl implements MusicPlayer {
    public void play(Music music) {
        // Implementar a lógica de reproduzir uma música
    }

    public void pause() {
        // Implementar a lógica de pausar a música
    }

    public void stop() {
        // Implementar a lógica de parar a música
    }
}

public class InternetBrowserImpl implements InternetBrowser {
    public void browse(String url) {
      // Implementar a lógica de navegar para uma URL
    }
  
    public void