import java.util.Scanner;

public class fisika2 {
    public static void main(String[] args) {
        int R1, R2, R3, R4, I;
        double V;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan R1 : ");
        R1 = in.nextInt();
        System.out.print("Masukkan R2 : ");
        R2 = in.nextInt();
        System.out.print("Masukkan R3 : ");
        R3 = in.nextInt();
        System.out.print("Masukkan R4 : ");
        R4 = in.nextInt();
        System.out.print("Masukkan  I : ");
        I = in.nextInt();

        double Rtotal;
        Rtotal = R4 + (1 / R1 + 1 / R2 + 1 / R3);
        V = I * Rtotal;
        int a = 3;
        int b = 2;
        float c = (float) a / b; 
        System.out.println("Hasilnya adalah = " + V);
    }
}
