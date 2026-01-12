package labsession4;

class PaymentProcessor {

    void processing() {
        System.out.println("Processing default Payment");
    }

    void processing(int num) {
        System.out.println("Payment of processing for " + num);
    }

    void processing(int num, String name) {
        System.out.println("Payment of processing for " + num + " for " + name);
    }
}

public class task1 {
    public static void main(String[] args) {

        PaymentProcessor p1 = new PaymentProcessor();

        p1.processing();
        p1.processing(1);
        p1.processing(1, "Fahad");

    }
}