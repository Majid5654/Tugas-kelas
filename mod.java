import java.util.Scanner;

public class mod {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    
System.out.println("Masukkan nama");
String u = scan.next();
System.out.println("Masukkan password");
int pass = scan.nextInt();
 if (u.equals("Majid") && pass == 123) {
    System.out.println("====================================");
            System.out.println("-----Selamat Datang Di Bank -----");
            System.out.println("====================================");
            System.out.println("1. Account");
            System.out.println("2. Transfer");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit\n");
}
else if (u == "Baihaqi" || pass == 124 ){
System.out.println("====================================");
            System.out.println("-----Selamat Datang Di Bank -----");
            System.out.println("====================================");
            System.out.println("1. Account");
            System.out.println("2. Transfer");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit\n");


}
else if (u == "Arka" || pass == 125){
    System.out.println("====================================");
            System.out.println("-----Selamat Datang Di Bank -----");
            System.out.println("====================================");
            System.out.println("1. Account");
            System.out.println("2. Transfer");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit\n");
}
else if (u == "Xavier" || pass == 126){

    System.out.println("====================================");
            System.out.println("-----Selamat Datang Di Bank -----");
            System.out.println("====================================");
            System.out.println("1. Account");
            System.out.println("2. Transfer");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit\n");
}

else{
    System.out.println("salah");
}

  







}

    }

