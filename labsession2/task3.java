package labsession2;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float temprature;
        String conditionOutside;

        System.out.println("What is the outside condition of your area (rainy or sunny):-");
        conditionOutside = input.nextLine();
        
        if(conditionOutside.equals("rainy") || conditionOutside.equals("sunny")) {

            System.out.println("Enter the temprature of your area");
            temprature = input.nextFloat();
            
            if(temprature < 0) {
                if(conditionOutside.equals("rainy")) {
                    System.out.println("Wear a heavy coat and take an umbrella");
                } else {
                    System.out.println("Wear a heavy coat and sunglasses");
                }
            } else if(temprature >= 0 && temprature <= 10) {
                if(conditionOutside.equals("rainy")) {
                    System.out.println("Wear a warm jacket and take an umbrella");
                } else {
                    System.out.println("Wear a warm jacket and sunglasses");
                }
            } else if(temprature >= 11 && temprature <= 20) {
                if(conditionOutside.equals("rainy")) {
                    System.out.println("Wear a light jacket and take an umbrella");
                } else {
                    System.out.println("Wear a light jacket and sunglasses");
                }
            } else if(temprature > 20) {
                if(conditionOutside.equals("rainy")) {
                    System.out.println("Wear light clothing and take an umbrella");
                } else {
                    System.out.println("Wear light clothing and sunglasses.");
                }
            }
        } else {
            System.out.println("Enter correct condition first");
        }
        input.close();

    }
}