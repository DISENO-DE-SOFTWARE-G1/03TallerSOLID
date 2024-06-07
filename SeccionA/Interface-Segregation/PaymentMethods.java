interface CreditCardPayment{
    void processCreditCardPayment();
}

interface PayPalPayment{
    void processPayPalPayment();
}

class CreditCardPaymentProcessor implements CreditCardPayment {
	@Override
	public void processCreditCardPayment() {
        // lógica de procesamiento de tarjeta
	}
}

class OnlinePaymentProcessor implements PayPalPayment {

	@Override
	public void processPayPalPayment() {
		// Lógica de procesamiento de paypal
	}

}
