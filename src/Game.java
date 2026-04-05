public class Game {
    private String nama_game;
    private String genre;
    private  double harga;

public Game(String nama_game, String genre, double harga) {
    this.nama_game = nama_game;
    this.genre = genre;
    this.harga = harga;
}

public String getNama_Game() {
    return nama_game;
}

public void setNama_Game (String nama_game) {
    this.nama_game = nama_game;
}

public String getGenre() {
    return genre;
}

public void setGenre (String genre) {
    this.genre = genre;
}

public double getHarga() {
    return harga;
}

public void setHarga(double harga) {
    this.harga = harga;
}

public void tampilkanInfo() {
    System.out.println("Nama Game: " + nama_game);
    System.out.println("Genre: " + genre);
    System.out.println("Harga: " + harga);
}

}
