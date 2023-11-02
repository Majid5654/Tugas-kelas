import java.util.Scanner;

public class program {
    public static void main(String[] args) {
    int [] nilaiAkhir = new int[6];
    Scanner scan = new Scanner(System.in);
    int max = nilaiAkhir[0];
    int min = Integer.MAX_VALUE;
    double total = 0;
    double bagi;

for(int i = 1;i<=5;i++){
    System.out.println("Masukkan nilai Orang ke "+i);
    nilaiAkhir[i] = scan.nextInt();
    if(nilaiAkhir[i]> max){
    max = nilaiAkhir[i];
}
    if (nilaiAkhir[i] < min){
    min = nilaiAkhir[i];
}
total += nilaiAkhir[i];

}
bagi = total/5.0;
System.out.println("Nilai terbesar adalah "+max);
System.out.println("Nilai terkecil adalah " +min);
System.out.println("Rata rata nilai adalah" +bagi);

    }
}
