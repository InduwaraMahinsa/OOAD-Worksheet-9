import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("\nNumbers: " + numbers);
        System.out.println("Sum: " + sum);

        sc.close(); // best practice
    }
}
