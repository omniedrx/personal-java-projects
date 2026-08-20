package Grade_Calculator;
import java.util.Scanner;
import java.util.ArrayList;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Grade Calculator ===");
        while (true) {
            ArrayList<Integer> grades = new ArrayList<Integer>();
            System.out.print("How many subjects/grades do you want to enter?: ");
            int size;
            try {
                size = Integer.valueOf(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Number only.");
                continue;
            }
            System.out.println();

            if (size < 1) {
                System.out.println("Grades can't be lesser than 1.");
                continue;
            }

            int i = 1;
            while (i <= size) {
                System.out.print("Enter grade " + i + ": ");
                int grade;
                try {
                    grade = Integer.valueOf(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid grade. Numbers only.");
                    continue;
                }

                if (grade < 1 || grade > 100) {
                    System.out.println("Grades can only range from 1 to 100.");
                    continue;
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
            if (average >= 97) {
                convertedGrade = "A+";
            } else if (average >= 93) {
                convertedGrade = "A";
            } else if (average >= 90) {
                convertedGrade = "A-";
            } else if (average >= 87) {
                convertedGrade = "B+";
            } else if (average >= 83) {
                convertedGrade = "B";
            } else if (average >= 80) {
                convertedGrade = "B-";
            } else if (average >= 77) {
                convertedGrade = "C+";
            } else if (average >= 73) {
                convertedGrade = "C";
            } else if (average >= 70) {
                convertedGrade = "C-";
            } else if (average >= 67) {
                convertedGrade = "D+";
            } else if (average >= 63) {
                convertedGrade = "D";
            } else if (average >= 60) {
                convertedGrade = "D-";
            } else {
                convertedGrade = "F";
            }

            System.out.println();
            System.out.println("--- Results ---");
            System.out.println("Total grades entered: " + size);
            System.out.println("Average: " + String.format("%.2f", average));
            System.out.println("Letter Grade: " + convertedGrade);

            System.out.println();
            System.out.print("Want to calculate another one? (y/n): ");
            String loop = scan.nextLine();
            System.out.println();
            if (loop.equalsIgnoreCase("y")) {
                continue;
            } else if (loop.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Invalid input.");
                continue;
            }
        }
        scan.close();
    }
}