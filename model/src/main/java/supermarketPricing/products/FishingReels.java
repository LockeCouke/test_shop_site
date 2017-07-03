package supermarketPricing.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import supermarketPricing.UserAccount;
import supermarketPricing.manufacturer.Manufacturer;
import supermarketPricing.products.types.FishingReelTypes;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FishingReels implements Product {

    @JsonIgnore
    @ManyToOne
    private UserAccount account;

    @Id
    @GeneratedValue
    private long productID;

    private double price;
      private String productName;
    private Manufacturer manufacturer;
    private FishingReelTypes fishingReelTypes;

    public FishingReels(int price, String productName, FishingReelTypes fishingReelTypes){
        this.price = price;
        this.productName = productName;
        this.fishingReelTypes = fishingReelTypes;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public long getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setProductID(long id) {
        this.productID=id;
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
