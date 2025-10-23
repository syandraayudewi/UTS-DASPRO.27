import java.util.Scanner;
public class KomisiPenjualan27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double omzet, komisi = 0, bonus = 0, total = 0;
        int rating;
        String sertif;

        System.out.print("Omzet: ");
        omzet = in.nextDouble();
        System.out.print("Rating: ");
        rating = in.nextInt();
        System.out.print("Sertifikasi (ya/tidak): ");
        sertif = in.next();

        if(rating < 70){
            System.out.println("Tidak dapat komisi (rating < 70)");
        } else {
            if(omzet < 50000000){
                komisi = omzet * 0.01;
            } else if(omzet < 100000000){
                komisi = omzet * 0.02;
            } else {
                komisi = omzet * 0.03;
            }

            if(rating >= 90){
                komisi = komisi + (omzet * 0.01);
            }

            if(sertif.equalsIgnoreCase("ya")){
                bonus = 500000;
            }

            total = komisi + bonus;

            System.out.println("Komisi: " + komisi);
            System.out.println("Bonus: " + bonus);
            System.out.println("Total: " + total);
        }
    }
}


