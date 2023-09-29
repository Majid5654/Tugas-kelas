import java.util.Scanner;

public class Selectionmod {
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
if (total > 80 && total <= 100)
System.out.println("predikat A sangat baik");
else if (total > 73 && total <= 80)
System.out.println("predikat B+ lebih dari baik ");
else if (total > 65 && total <= 73)
System.out.println("Predikat B baik");
else if (total >60 && total <= 65)
System.out.println("predikat C+ lebih dari cukup");
else if (total > 50 && total <= 60)
System.out.println("predikat C cukup");
else if (total > 39 && total <= 50)
System.out.println("Predikat D kurang");
else
System.out.println("Predikat E gagal");





    }
}
