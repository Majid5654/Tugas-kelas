import java.util.Scanner;

public class cobaaaa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai N = ");
        int N = scan.nextInt();

        if (N >= 3) {
            int i = 1;
            while (i <= N) {
                // Cetak spasi sebelum angka
                int space = 1;
                while (space <= N - i) {
                    System.out.print(" ");
                    space++;
                }

                // Cetak angka dari kanan
                int j = 1;
                while (j <= i) {
                    System.out.print(j);
                    j++;
                }
                System.out.println();
                i++;
            }

        } else {
            System.out.println("Minimal angka yang dimasukkan 3 ");
        }

        // Menutup Scanner
        scan.close();
    }
}
