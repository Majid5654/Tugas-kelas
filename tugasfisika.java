import java.util.Scanner;

public class tugasfisika {
    public static void main(String[] args) {
    int R1,R2,R3,R4,I;
    double V;

    Scanner in = new Scanner(System.in);
    R1 = in.nextInt();
    R2 = in.nextInt();
    R3 = in.nextInt();
    R4 = in.nextInt();
     I = in.nextInt();

    double Rtotal;
    Rtotal = R4 + (1/(1.0/R1+1.0/R2+1.0/R3));
    V = I*Rtotal;
    System.out.println("R Total = " +Rtotal);
    System.out.println(" V = " + V);
    
    
    int a = 3;
    int b = 2;
    float c = (a/b);
    System.out.println(c);

    }
}
