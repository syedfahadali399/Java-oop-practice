package labsession3;

class Car {
    String make;
    String model;
    int year;
    double price;

    Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;

        carDetail();
        checkCarAge();
    }

    void carDetail() {

        System.out.println("Car Company " + make);
        System.out.println("Car Model " + model);
        System.out.println("Car making year" + year);
        System.out.println("Car Price before Discount " + price +"PKR");
        carDiscount();
    }

    void carDiscount() {
        int totalDiscount = 10;
        double afterDiscount = (price * totalDiscount) / 100;
        double totalAmount = price - afterDiscount;
        System.out.println("Car price after 10% discount " + totalAmount +"PKR");
    }

    void checkCarAge() {
        if(year < 2005) {
            System.out.println("The car is use more than 20 years!");
        } else {
            System.out.println("The car is not use more than 20 years!");
        }
    }
}

public class task3 {
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota Vitz", "Sedan", 2012, 2100000);
        myCar.carDetail();
    }
}