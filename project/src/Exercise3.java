import java.util.HashSet;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 students heights ");
        HashSet<Double> heights = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            heights.add(sc.nextDouble());
        }

        System.out.println("Display unique heights of  students");
        for(Double height : heights){
            System.out.println(height);
        }
    }
}
