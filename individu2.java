import java.util.Scanner;

public class individu2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Masukkan nilai N = ");
int N = scan.nextInt();
int i = N;
while (i>=1) {
    int j = 1;
    while (j<=i) {
        System.out.print("*");
        j++;
    }
    System.out.println();
    i--;
}
    }
}
