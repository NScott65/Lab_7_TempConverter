import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double userTemp = 0;
        boolean done = true;

        do{
            System.out.println("Enter the tempature in Celsius: ");
            userTemp = scan.nextDouble();
                    if(scan.hasNextDouble()){
                        double fTemp = (userTemp * (9 / 5)) + 32;
                    }else{
                        System.out.println("Your input was invalid. Try Again");
                    }
            System.out.println("Enter 'N' to STOP.");
                    if(userTemp = "N")
        }while(done);

    }
}