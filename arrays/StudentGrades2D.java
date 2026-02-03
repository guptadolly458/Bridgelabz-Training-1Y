import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // [student][subject]
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) { j--; continue; }
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grade[i] = calculateGrade(percentage[i]);
        }

        System.out.println("\n--- Student Results ---");
		for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] +
                               ", Chemistry=" + marks[i][1] +
                               ", Maths=" + marks[i][2] +
                               ", Percentage=" + percentage[i] +
                               "%, Grade=" + grade[i]);
        }
        sc.close();
    }

    public static char calculateGrade(double percentage) {
        if (percentage >= 80) return 'A';
        else if (percentage >= 70) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 50) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'R';
    }
}

