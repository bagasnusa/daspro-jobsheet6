import java.util.Scanner;

public class Pemilihan2Percobaan1No06 {
    public static void main(String[] args) {
        Scanner inputAbsen = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = inputAbsen.nextInt();

        System.out.println("Anda memasukkan tahun: " + tahun);

        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}




