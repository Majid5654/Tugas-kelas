import java.util.Scanner;
public class pemilihan2perobaan1 {
    public static void main(String[] args) {
    Scanner input08 = new Scanner (System.in);
    System.out.println("Input year");
    int year = input08.nextInt(); 
    if ((year % 4 ) == 0 ){
       if (year%100 != 0)
       System.out.println("leap year");
    }
    else {
    System.out.println("not a leap year");
    }





    
    }
}
