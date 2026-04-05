import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        String lanjut;

        System.out.println("PROGRAM KOLEKSI GAME");

        do {
            System.out.println("MASUKKAN DATA GAME");

            System.out.println("Nama Game   : ");
            String nama_game = input.nextLine();

            System.out.println("Genre  : " );
            String genre = input.nextLine();

            System.out.println("Harga   : ");
            double harga = input.nextDouble();

            System.out.println("Ukuran (GB) : ");
            double ukuran_game = input.nextDouble();
            input.nextLine();

            System.out.println("Platform :");
            String platform = input.nextLine();

            GameOnline gameBaru = new GameOnline(nama_game, genre, harga, ukuran_game, platform);

            System.out.println("OKE UDAH MASUK, JANGAN LUPA DIMAININ YA!!");

            System.out.println("Isi lagi? (y/n)");
            lanjut = input.nextLine();

        } while (lanjut.equalsIgnoreCase("y"));
            input.close();
    }      
}
