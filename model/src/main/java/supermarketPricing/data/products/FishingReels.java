package supermarketPricing.data.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import supermarketPricing.UserAccount;
import supermarketPricing.data.manufacturer.Manufacturer;
import supermarketPricing.data.products.types.FishingReelTypes;

import javax.persistence.*;

@Entity
public class FishingReels implements Product {

    @JsonIgnore
    @ManyToOne
    private UserAccount account;

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Manufacturer manufacturer;

    @Enumerated(EnumType.STRING)
    private FishingReelTypes fishingReelTypes;

    private double price;
    private String productName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FishingReels that = (FishingReels) o;

        if (!id.equals(that.id)) return false;
        if (!manufacturer.equals(that.manufacturer)) return false;
        if (fishingReelTypes != that.fishingReelTypes) return false;
        return productName.equals(that.productName);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + fishingReelTypes.hashCode();
        result = 31 * result + productName.hashCode();
        return result;
    }

    public FishingReels(int price, String productName, FishingReelTypes fishingReelTypes, Manufacturer manufacturer){
        this.price = price;
        this.productName = productName;
        this.fishingReelTypes = fishingReelTypes;
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setFishingReelTypes(FishingReelTypes fishingReelTypes){
        this.fishingReelTypes = fishingReelTypes;
    }

    public FishingReelTypes getFishingReelTypes(){
        return fishingReelTypes;
    }
}
