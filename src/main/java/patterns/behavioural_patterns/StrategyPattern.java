package patterns.behavioural_patterns;

interface PaymentStrategy {
    public void pay(int amount);
}

class PaypalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount){
        System.out.println("Amount paid: " + amount + " using Paypal.");
    }
}

class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount){
        System.out.println("Amount paid: " + amount + " using Credit card.");
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}
public class StrategyPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new PaypalPaymentStrategy());
        cart.checkout(10000);
    }
}
