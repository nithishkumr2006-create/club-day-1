import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); 
        System.out.print("Enter a double: ");
        double d = scanner.nextDouble();  
        System.out.println("You entered integer: " + num);
        System.out.println("You entered double: " + d);
        scanner.close();
    }
}