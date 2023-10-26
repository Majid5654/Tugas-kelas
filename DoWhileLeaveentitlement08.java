import java.util.Scanner;
public class DoWhileLeaveentitlement08 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int jatahcuti,jumlahHari;
String konfirmasi;
System.out.println("Jatah cuti");
jatahcuti = scan.nextInt();

do{
    System.out.println("Apakah anda ingin mengambil cuti (y/t)");
    konfirmasi = scan.next();
if (konfirmasi.equals("y") || konfirmasi.equals("Y")) {
    System.out.println("Jumlah hari : ");
    jumlahHari = scan.nextInt();

       if (jumlahHari <= jatahcuti) {
        jatahcuti -= jumlahHari;
        System.out.println("Sisa jatah cuti: " +jatahcuti);
        
        }
        else{

            System.out.println("Sisa jatuh cuti anda tidak mencukupi");
            break;
       }
}
    




}



while(jatahcuti > 0);



    }
}
