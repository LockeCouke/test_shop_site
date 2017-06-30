package supermarketPricing.discounts;

public class ThreeForOne implements Discount {

    private int count;
    private double price;
    private long discountProductId;

    public ThreeForOne(long discountProductId, int count, double price){
        this.discountProductId = discountProductId;
        this.count =  count;
        this.price = price;
    }

    public double process() {
        return 0;
    }
}
