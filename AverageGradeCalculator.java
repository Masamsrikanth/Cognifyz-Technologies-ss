import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Average Grade Calculator");
        System.out.print("Enter the number of grades to be entered: ");
        int numGrades = scanner.nextInt();

        if (numGrades <= 0) {
            System.out.println("Invalid number of grades. Please enter a positive integer.");
            return;
        }

        double sum = 0;

        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = scanner.nextDouble();

            // Check if grade is within valid range (0 to 100)
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Grade must be between 0 and 100.");
                return;
            }
        

            sum += grade;
        }

        double average = sum / numGrades;
        System.out.println("Average grade: " + average);

        scanner.close();
    }
}