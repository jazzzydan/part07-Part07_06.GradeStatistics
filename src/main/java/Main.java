
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();
        Scanner scanner = new Scanner(System.in);
        UserInterface uI = new UserInterface(register, scanner);
        uI.start();
    }
}
