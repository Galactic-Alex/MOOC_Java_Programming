import java.util.ArrayList;
import java.util.HashMap;

public class Grades {
    private ArrayList<Integer> grades;

    public Grades() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int number) {
        if (number > -1 && number < 101) {
            grades.add(number);
        }
    }

    public int sumOfGrades() {
        int sum = 0;
        for (int i : grades) {
            sum += i;
        }
        return sum;
    }

    public int totalGrades() {
        return grades.size();
    }

    public double totalGradeAverage() {
        return sumOfGrades() * 1.0 / totalGrades();
    }

    public double passingGradeAverage() {
        int totalPassingGrades = 0;
        int sumOfPassingGrades = 0;
        for (int i : grades) {
            if (i >= 50) {
                sumOfPassingGrades += i;
                totalPassingGrades++;
            }
        }
        return sumOfPassingGrades * 1.0 / totalPassingGrades;
    }

    public double passingGradePercentage() {
        int totalPassingGrades = 0;
        for (int i : grades) {
            if (i >= 50) {
                totalPassingGrades++;
            }
        }
        return 100 * totalPassingGrades / (double) grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public int[] gradeDistribute() {
        int[] gradeDistribution = new int[6];
        for (int i : grades) {
            if (i >= 90) {
                gradeDistribution[5]++;
            } else if (i > 79) {
                gradeDistribution[4]++;
            } else if (i > 69) {
                gradeDistribution[3]++;
            } else if (i > 59) {
                gradeDistribution[2]++;
            } else if (i > 49) {
                gradeDistribution[1]++;
            } else {
                gradeDistribution[0]++;
            }
        }
        return gradeDistribution;
    }
}
