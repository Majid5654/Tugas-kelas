import java.util.Scanner;

public class lingkaran08 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int r;
    double keliling,luas;
    System.out.println("Masukkan jari jari");
    r = input.nextInt();
    keliling= (2*r)*3.14 ;
    luas = 3.14*r*r;
    System.out.println("Maka keliling adalah" + keliling);
    System.out.println("Maka luas adalah" + luas);
    



    }
}
