package findhypotenuse;
import java.util.Scanner;
public class FindHypotenuse {
    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        double base, height, hypotenuse;
        System.out.print("Enter right triangle base: ");
        base = computerKeyboardInput.nextDouble();
        System.out.print("Enter right triangle height: ");
        height = computerKeyboardInput.nextDouble();
        hypotenuse = Math.sqrt(base * base + height * height);
        System.out.println("Hypotenuse length = " + hypotenuse);
    }
}
