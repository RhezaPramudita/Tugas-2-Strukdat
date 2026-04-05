public class GameOnline extends Game {
    private double ukuran_game;
    private String platform;

public GameOnline(String nama_game, String genre, double harga, double ukuran_game, String platform) {
    super(nama_game, genre, harga);
    this.ukuran_game = ukuran_game;
    this.platform = platform;
}

@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Ukuran File: " + ukuran_game);
    System.out.println("Platform: " + platform);
}

}
