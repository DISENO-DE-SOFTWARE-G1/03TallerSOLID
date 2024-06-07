interface PaymentMethod {
    public void realizarCobro(double monto);
}

public class Compra {
    PaymentMethod paymentMethod;
    public Compra(PaymentMethod p){
        this.paymentMethod = p;
    }
    public void agregarArticulo(Articulo articulo) {
        // agregar un articulo a la compra
    }

    public void removerArticulo(Articulo articulo) {
        // remover un articulo a la compra
    }
}
