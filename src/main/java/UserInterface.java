import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String entry = scanner.nextLine();
            if (entry.equals("-1")) {
                break;
            }
            register.addPoints(entry);
        }
        System.out.println("Point average (all): " + register.pointsAverage());

        if (register.passingPointsAverage() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + register.passingPointsAverage());
        }
        System.out.println("Pass percentage: " + register.passingPercentage());
        System.out.println("Grade distribution:");
        printGradeDistribution();
    }
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
