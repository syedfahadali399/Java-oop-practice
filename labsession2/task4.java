package labsession2;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int seasonFinder;
        int hemisphereFinder;

        System.out.println("Welcome to Season finder app");
        System.out.println("Which Hemisphere are you from (1.Southern Hemisphere 2. Northern Hemisphere) press 1 or 2: ");
        hemisphereFinder = input.nextInt();

        if(hemisphereFinder == 1 || hemisphereFinder == 2) {

            System.out.println("Enter your month in number format: ");
            seasonFinder = input.nextInt();

            if(hemisphereFinder == 1) {
                // for northern hemisphere //
                switch (seasonFinder) {
                    case 1:
                    case 2:
                        System.out.println("Its Winter");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Its Spring");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Its Summer");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Its Autumn");
                        break;
                    case 12:
                        System.out.println("Its Winter");
                        break;
                    default:
                        System.out.println("Enter valid number");
                        break;
                }
            } else {
                // for southern hemisphere //
                switch (seasonFinder) {
                    case 1:
                    case 2:
                        System.out.println("Its Summer");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Its Autumn");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Its Winter");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Its Spring");
                        break;
                    case 12:
                        System.out.println("Its Summer");
                        break;
                    default:
                        System.out.println("Enter valid number");
                        break;
                }
            }

        } else {
            System.out.println("Enter correct number");
        }


        input.close();
    }
}