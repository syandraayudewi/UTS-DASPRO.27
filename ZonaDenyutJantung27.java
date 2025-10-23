import java.util.Scanner;
public class ZonaDenyutJantung27 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int usia = sc.nextInt();
        System.out.print("Masukkan detak jantung saat latihan: ");
        int hr = sc.nextInt();

        int mhr = 220 - usia;
        double persen = (double) hr / mhr * 100;

        String kategori = "";
        String saran = "";

        if (persen < 50) {
            kategori = "Sangat ringan";
            saran = "Pemanasan, manfaat minimal";
        } else if (persen < 60) {
            kategori = "Ringan";
            saran = "Peningkatan dasar kebugaran";
        } else if (persen < 70) {
            kategori = "Sedang";
            saran = "Zona aerobik nyaman";
        } else if (persen <= 85) {
            kategori = "Kuat";
            saran = "Meningkatkan kapasitas kardiorespirasi";
        } else {
            kategori = "Sangat berat";
            saran = "Berisiko bagi pemula, batasi durasi";
        }

        System.out.println();
        System.out.println("MHR = " + mhr);
        System.out.println("%MHR = " + Math.round(persen) + "%");
        System.out.println("Kategori = " + kategori);
        System.out.println("Saran = " + saran);
    }
}


