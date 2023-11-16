import java.util.Scanner;

public class individu1 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Masukkan nilai N = ");
int N = scan.nextInt();
if (N>=3) {
   int i = 1;
    while (i<=N) {
    int j = 1;
    while (j<=i) {
        System.out.print(j);
        j++;
    }
    System.out.println();
    i++;
} 
    
}
else{
    System.out.println("Minimal angka yang dimasukkan 3 ");
    
}

    }
}
