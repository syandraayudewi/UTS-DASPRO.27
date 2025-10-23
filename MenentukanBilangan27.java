import java.util.Scanner;
public class MenentukanBilangan27 {
    public static void main  (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int c = sc.nextInt();

        int terkecil = Math.min(a, Math.min(b, c));
        System.out.println("\n=== HASIL ===");
        if (a == terkecil && b == terkecil && c == terkecil) {
            System.out.println("Ketiga angka sama dan merupakan angka terkecil: " + terkecil);
        } else if ((a == terkecil && b == terkecil) ||
                   (a == terkecil && c == terkecil) ||
                   (b == terkecil && c == terkecil)) {
            System.out.print("Beberapa angka terkecil sama yaitu: ");
            if (a == terkecil) System.out.print(a + " ");
            if (b == terkecil) System.out.print(b + " ");
            if (c == terkecil) System.out.print(c + " ");
            System.out.println();
        } else {
            System.out.println("Angka terkecil adalah: " + terkecil);
        }
    }
}
    

