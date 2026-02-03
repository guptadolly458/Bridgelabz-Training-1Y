import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
                double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Weight input validation
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0)
                    System.out.println("Invalid weight. Enter positive value.");
            } while (personData[i][0] <= 0);
            do {
                System.out.print("Enter height (meters): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0)
                    System.out.println("Invalid height. Enter positive value.");
            } while (personData[i][1] <= 0);
        }
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }
        System.out.println("\nPerson Details:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                    " | Weight: " + personData[i][0] +
                    " | Height: " + personData[i][1] +
                    " | BMI: " + personData[i][2] +
                    " | Status: " + weightStatus[i]);
        }
    }
}
