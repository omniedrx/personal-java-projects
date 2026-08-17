import java.util.Scanner;
import java.util.ArrayList;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<Integer>();

        System.out.println("=== Grade Calculator ===");
        System.out.print("How many subjects/grades do you want to enter?: ");
        int size;
        try {
            size = Integer.valueOf(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Number only.");
            return;
        }
        System.out.println();

        int i = 1;
        while (i <= size) {
            System.out.print("Enter grade " + i + ": ");
            int grade;
            try {
                grade = Integer.valueOf(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade. Numbers only.");
                return;
            }

            if (grade < 1 || grade > 100) {
                System.out.println("Grades can only range from 1 to 100.");
                return;
            }

            grades.add(grade);
            i++;
        }

        int sum = 0;
        for (Integer grade: grades) {
            sum += grade;
        }

        double average = (double) sum / size;
        String convertedGrade = "";
        if (average >= 90) {
            convertedGrade = "A";
        } else if (average >= 80) {
            convertedGrade = "B";
        } else if (average >= 70) {
            convertedGrade = "C";
        } else if (average >= 60) {
            convertedGrade = "D";
        } else {
            convertedGrade = "F";
        }

        System.out.println();
        System.out.println("--- Results ---");
        System.out.println("Total grades entered: " + size);
        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Letter Grade: " + convertedGrade);
    }
}
