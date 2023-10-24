import java.util.Scanner;

public class Pemilihan2Percobaan2Noo6 {
    public static void main(String[] args) {
        Scanner inputAbsen = new Scanner(System.in);

        System.out.println("Masukkan tiga sudut segitiga:");
        double sudut1, sudut2, sudut3;

        System.out.print("Sudut 1: ");
        sudut1 = inputAbsen.nextDouble();

        System.out.print("Sudut 2: ");
        sudut2 = inputAbsen.nextDouble();

        System.out.print("Sudut 3: ");
        sudut3 = inputAbsen.nextDouble();

        double totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if (sudut1 == sudut2 && sudut2 == sudut3) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}


