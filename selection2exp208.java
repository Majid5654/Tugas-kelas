import java.util.Scanner;
public class selection2exp208 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);
        System.out.println("Input angle 1");
        int angle1 = input08.nextInt();
        System.out.println("Input angle 2");
        int angle2 = input08.nextInt();
        System.out.println("Input angle 3");
        int angle3 = input08.nextInt();
        int totalAngle = angle1+angle2+angle3;
        if(totalAngle == 180){
            if (angle1 == 90 || angle2 == 90 || angle3 == 90){
                System.out.println("RIGHT TRIANGLE");
            }
            else if (angle1 == 60 && angle2 == 60 && angle3 == 60){
                System.out.println("equilateral triangle");
            }
            else if (angle1 == angle2 && angle3 == 80){
                System.out.println("isosceles triangle");
            }
        }
else
System.out.println("Not a triangle");
}
}
