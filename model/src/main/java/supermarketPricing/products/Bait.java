package supermarketPricing.products;

import supermarketPricing.manufacturer.Manufacturer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bait implements Product {

    @Id
    @GeneratedValue
    Long id;

    Manufacturer manufacturer;
    double price;
    String productName;
    int packageQuantity;

    @Override
    public Manufacturer getManufacturer() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public long getProductID() {
        return 0;
    }

    @Override
    public String getProductName() {
        return null;
    }

    @Override
    public void setManufacturer(Manufacturer manufacturer) {

    }

    @Override
    public void setProductID(long id) {

    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public void setProductName(String name) {

    }
}
