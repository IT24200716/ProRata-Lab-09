import java.util.Scanner;

public class Lab9Q4 {

    // Calculate final mark
    public static double calcFinalMark(double assignmentMark, double examMark) {

        double finalMark = (assignmentMark * 0.30) + (examMark * 0.70);

        return finalMark;
    }

    // Find grade
    public static char findGrades(double finalMark) {

        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Print student details
    public static void printDetails(String name, double finalMark, char grade) {

        System.out.printf("%-15s %-15.2f %-10c%n",
                name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("%-15s %-15s %-10s%n",
                "Name", "Final Mark", "Grade");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            double examMark = input.nextDouble();

            input.nextLine();

            double finalMark = calcFinalMark(assignmentMark, examMark);

            char grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}