
interface Notificacion {
    void notificar(PaymentMethod pago);
}

class NotificarSMS implements Notificacion{
    @Override
    public void notificar(PaymentMethod pago) {
	// enviar SMS
    }
}

class NotificarEmail implements Notificacion{
    @Override
    public void notificar(PaymentMethod pago) {
    }
}

class NotificarSignal implements Notificacion{
    @Override
    public void notificar(PaymentMethod pago) {
		// enviar SMS
    }
}
