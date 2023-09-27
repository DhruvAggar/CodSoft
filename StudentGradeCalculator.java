
import java.util.Scanner;

import javax.xml.transform.Source;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks obtained in all subjects that was scored out of 100");

        System.out.println("Enter Marks obtained in English");
        float a = sc.nextInt();
        System.out.println("Enter Marks obtained in Maths");
        float b = sc.nextInt();
        System.out.println("Enter Marks obtained in Physics");
        float c = sc.nextInt();
        System.out.println("Enter Marks obtained in Chemistry");
        float d = sc.nextInt();
        System.out.println("Enter Marks obtained in Physical Education");
        float e = sc.nextInt();

        float sum = a + b + c + d + e;
        System.out.println("Total Marks Obtained");
        System.out.println(sum);

        float percentage = sum * 100 / 500;
        System.out.println("Percentage Obtained according to marks");
        System.out.println(percentage);

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Your Grade is 'A'");
        } else if (percentage >= 80 && percentage <= 89) {
            System.out.println("Your Grade is 'B'");
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("Your Grade is 'C'");
        } else if (percentage >= 50 && percentage <= 69) {
            System.out.println("Your Grade is 'D'");
        } else if (percentage > 34 && percentage <= 49) {
            System.out.println("Your Grade is 'E'");
        } else {
            System.out.println("Your Grade is 'F'");
        }
    }
}
