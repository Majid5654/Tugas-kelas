import java.util.Scanner;

public class Selection208 {
public static void main(String[] args) {
Scanner input08 = new Scanner(System.in);
System.out.println("Nilai UAS :");
float finalExam = input08.nextFloat();
System.out.println("Nilai UTS :");
float midExam = input08.nextFloat();
System.out.println("Nilai kuis :");
float quiz = input08.nextFloat();
System.out.println("Nilai tugas");
float assignment = input08.nextFloat();
float   total = (finalExam * 0.4F) + (midExam*0.3F) + (quiz * 0.1F) + (assignment * 0.2F);
String message = total < 65 ? " Retake" : "Pass";
System.out.println("Final Grade = " +total+"and the decision is" + message); 
}
}
