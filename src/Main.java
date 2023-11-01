import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double c;
        boolean done = false;
        double f;
        String n = " ";

        do{
            System.out.println("Enter temperature in Celsius. Enter 'N' to STOP: ");
                if (scan.hasNextDouble()) {
                    c = scan.nextDouble();
                    f = (c * 1.8) + 32;
                    System.out.println("The temperature in fahrenheit is: " + f);
                } else if (scan.hasNextLine()) {
                    n = scan.nextLine();
                    if (n.equalsIgnoreCase("N")) {
                        done = true;
                    } else {
                        System.out.println("Your input was invalid. Try Again.");
                    }
                } else {
                    System.out.println("Your input was invalid. Try Again.");
                }
            
        }while(!done);

    }
}
