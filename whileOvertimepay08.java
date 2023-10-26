import java.util.Scanner;
public class whileOvertimepay08 {
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
int numEmployee;
double overtimePay = 0;
double totalOvertimePay = 0;
int overtimeHours;
String position;
System.out.println("Employee number = ");
numEmployee = input.nextInt();
int i=0;
while (i < numEmployee) {
    System.out.println("Position of employee " +(i+1)+ "(director,manager,staff) = ");
    position = input.next();
    System.out.println("Employee " + (i+1)+ "overtime hours = ");
    overtimeHours = input.nextInt();
i++;

if (position.equalsIgnoreCase("director")) {
    continue;
}
else if (position.equalsIgnoreCase("manager")){

    overtimePay = overtimeHours*100000;
}

else if(position.equalsIgnoreCase("staff")){
    overtimePay=overtimeHours*75000;
}
else{
    System.out.println("Invalid Position");
    i--;
    continue;
}

    totalOvertimePay += overtimePay;
//i++;
}

System.out.println("Total of Overtime Pay = "+totalOvertimePay);

}

    }

