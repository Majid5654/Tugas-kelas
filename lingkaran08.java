import java.util.Scanner;

public class lingkaran08 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int r;
    double area,Circumferences;
    System.out.println("Input the radius");
    r = input.nextInt();
    area= (2*r)*3.14 ;
    Circumferences = 3.14*r*r;
    System.out.println("Area"+ area );
    System.out.println("Circumferences" + Circumferences);
    



    }
}
