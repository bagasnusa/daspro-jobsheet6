import java.util.Scanner;

public class bagaspemilihan2percobaan3No06 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        
        System.out.print("Masukkan Kategori : ");
        String kategori = input06.nextLine(); 
        System.out.print("Masukkan Besarnya Penghasilan : ");
        int penghasilan = input06.nextInt(); 

        double pajak = 0;
        int gajiBersih;

        if (kategori.equalsIgnoreCase("pekerja buruh")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pembisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else {
            System.out.println("Masukkan Kategori Salah");
        }

        input06.close();
    }
}
