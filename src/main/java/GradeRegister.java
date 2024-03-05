import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.pointsList = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoints(String numberAsString) {

        int number = Integer.valueOf(numberAsString);
        if (number >= 0 && number <= 100){
            this.pointsList.add(number);
            this.grades.add(pointsToGrade(number));
        }
    }
    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    public double pointsAverage() {
        if (pointsList.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int points : pointsList) {
            sum += points;
        }
        return 1.0 * sum / pointsList.size();
    }

    public double passingPointsAverage() {
        if (pointsList.isEmpty()) {
            return 0;
        }
        int sum = 0;
        int count = 0;
        for (int points : pointsList) {
            if (points >= 50 && points <= 100) {
                sum += points;
                count++;
            }
        }
        // Check if there are no passing grades
        if (count == 0) {
            return 0;
        }

        return 1.0 * sum / count;
    }

    public double passingPercentage() {
        if (pointsList.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int points : pointsList) {
            if (points >= 50 && points <= 100) {
                count++;
            }
        }
        return 1.0 * 100 * count / pointsList.size();
    }
}
