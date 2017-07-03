package supermarketPricing.data.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import supermarketPricing.UserAccount;
import supermarketPricing.data.manufacturer.Manufacturer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bait implements Product {

    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    Manufacturer manufacturer;

    @JsonIgnore
    @ManyToOne
    private UserAccount userAccount;

    double price;
    String productName;
    int packageQuantity;

    @Override
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(int packageQuantity) {
        this.packageQuantity = packageQuantity;
    }
}
