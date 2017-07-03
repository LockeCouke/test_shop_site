package supermarketPricing.data.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import supermarketPricing.UserAccount;
import supermarketPricing.data.manufacturer.Manufacturer;
import supermarketPricing.data.products.types.BiteTypes;

import javax.persistence.*;

@Entity
public class Bait implements Product {

    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    Manufacturer manufacturer;

    @Enumerated(EnumType.STRING)
    private BiteTypes biteTypes;

    @JsonIgnore
    @ManyToOne
    private UserAccount userAccount;

    double price;
    String productName;
    int packageQuantity;

    public Bait(Manufacturer manufacturer, BiteTypes biteTypes, double price, String productName, int packageQuantity) {
        this.manufacturer = manufacturer;
        this.biteTypes = biteTypes;
        this.price = price;
        this.productName = productName;
        this.packageQuantity = packageQuantity;
    }

    @Override
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Long getId() {
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

    public BiteTypes getBiteTypes() {
        return biteTypes;
    }

    public void setBiteTypes(BiteTypes biteTypes) {
        this.biteTypes = biteTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bait bait = (Bait) o;

        if (packageQuantity != bait.packageQuantity) return false;
        if (!id.equals(bait.id)) return false;
        if (!manufacturer.equals(bait.manufacturer)) return false;
        if (biteTypes != bait.biteTypes) return false;
        return productName.equals(bait.productName);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + biteTypes.hashCode();
        result = 31 * result + productName.hashCode();
        result = 31 * result + packageQuantity;
        return result;
    }
}
