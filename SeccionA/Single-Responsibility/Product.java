/**
 * Product
 */
class Product {
    String title;
    double price;

    public Product(String title, double price){
        this.title = title;
        this.price = price;
    }

    double getPrice(){
        return this.price;
    }
}

class TaxRate {
    private double rate;
    private int limit;

    public TaxRate(double rate, int limit) {
        this.rate = rate;
        this.limit = limit;
    }

    public double getRate() {
        return rate;
    }

    public int getLimit() {
        return limit;
    }
}

class TaxCalculator {
    static double calculateTax(Product product, TaxRate taxConfig){    
        return taxConfig.getLimit() < product.getPrice() ? product.getPrice() * taxConfig.getRate() : 0;
    }
}
