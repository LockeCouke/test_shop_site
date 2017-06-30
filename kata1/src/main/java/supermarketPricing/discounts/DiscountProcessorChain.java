package supermarketPricing.discounts;

import supermarketPricing.products.Product;

import java.util.LinkedList;
import java.util.List;

public class DiscountProcessorChain {
    List<Discount> discounts = new LinkedList<Discount>();

    public void add(Discount discount){
        discounts.add(discount);
    }

    public double process(List<Product> list){
        for (Discount discount: discounts) {
            discount.process();
        }
        return 1.0;
    }
}
