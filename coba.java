import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    String[] nama = new String[3]; 
    
    int i;
    for(i=0;i<=2;i++)
    {
     System.out.println("Masukkan nama anda: "+i+1);
    nama[i] = scan.nextLine();
     
     
    

    }
    for(i=0;i<=2;i++)
    {
    System.out.println ("nama  anak adalah anda adalah ke "+i+1 +nama[i]);
    
 


    }

    }
}
