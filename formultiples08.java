import java.util.Scanner;
public class formultiples08 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int multiple;
    int counter = 0;
    int sum = 0;

    System.out.println("Input the multiple = ");
    multiple = scan.nextInt();

    int i = 1;
        while (i <= 50) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
            i++;
        }

        System.out.printf("There are %d numbers that are multiples of %d in range 1 to 50. \n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d.\n", multiple, sum);



    }
}
