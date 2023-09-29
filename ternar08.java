import java.util.Scanner;

public class ternar08 {
public static void main(String[] args) {
Scanner input08 = new Scanner (System.in);
System.out.println("Input a number : ");
int number = input08.nextInt();

String hasil = number% 2 == 0 ? "is an even number" : "is an odd number";
System.out.println(hasil);

}
}
