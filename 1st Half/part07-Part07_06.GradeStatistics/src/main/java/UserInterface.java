import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        Grades grades = new Grades();
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            grades.addGrade(number);
        }
        System.out.println("Point average (all): " + grades.totalGradeAverage());
        double passingGradeAverage = grades.passingGradeAverage();
        if (passingGradeAverage == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingGradeAverage);
        }
        System.out.println("Pass percentage: " + grades.passingGradePercentage());
        System.out.println("Grade distribution:");
        printDistribution(grades);
    }

    public void printDistribution(Grades grades) {
        int[] distribution = grades.gradeDistribute();
        for (int i = distribution.length - 1; i > -1; i--) {
            System.out.print(i + ": ");
            printStar(distribution[i]);
            System.out.println();
        }
    }

    public void printStar(int amountOfTimes) {
        while (amountOfTimes > 0) {
            System.out.print("*");
            amountOfTimes--;
        }
    }
}
