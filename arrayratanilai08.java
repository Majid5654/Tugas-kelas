import java.util.Scanner;
public class arrayratanilai08 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int[]nilaiMhs=new int[10];
    double total = 0;
    double rata2;
    int banyak = 0;
for(int i = 0;i<nilaiMhs.length;i++){
    System.out.println("Masukkan nilai Mahasiswa ke - "+(i+1)+" : ");
    nilaiMhs[i]= scan.nextInt();
    if(nilaiMhs[i] >70){
        banyak++;
    }
    }
for(int i = 0;i< nilaiMhs.length;i++){
    total+= nilaiMhs[i];
}
rata2= total/nilaiMhs.length;
System.out.println("Rata rata nilai = " +rata2);
System.out.println("Banyak siswa yang lulus adalah " +banyak);
    }
}
