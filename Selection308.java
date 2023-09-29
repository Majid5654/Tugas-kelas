import java.util.Scanner;

public class Selection308 {
    public static void main(String[] args) {
     Scanner input08 = new Scanner (System.in);
     double operand1,operand2,result;
     char operator;
     System.out.println("Input operand 1 : ");
     operand1 = input08.nextDouble();
     System.out.println("Input operand 2 : ");
     operand2 = input08.nextDouble();
     System.out.println("Input operator (+ - * /): ");
     operator = input08.next().charAt(0);

    switch (operator){
    case '+':
    result = operand1 + operand2;
    System.out.println(operand1 + "+" + operand2 + "=" + result);
    break;
    case '-':
    result = operand1 - operand2;
    System.out.println(operand1 + "*" + operand2 + "=" + result);
    break;
    case '*':
    result = operand1 * operand2;
    System.out.println(operand1 * operand2);
    System.out.println(operand1 + "*" + operand2 + "=" + result);
    break;
    case '/':
    result = operand1 / operand2;
    System.out.println(operand1 + "/" + operand2 + "=" + result);
    break;






    }



    }
}
