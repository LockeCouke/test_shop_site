package supermarketPricing.data.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import supermarketPricing.UserAccount;
import supermarketPricing.data.manufacturer.Manufacturer;
import supermarketPricing.data.products.types.FishingRodTypes;

import javax.persistence.*;

@Entity
public class FishingRods implements Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonIgnore
    @ManyToOne
    private UserAccount userAccount;

    @ManyToOne
    private Manufacturer manufacturer;

    @Enumerated(EnumType.STRING)
    private FishingRodTypes fishingRodTypes;

    private double price;
    private String productName;

    public FishingRods(int price, String productName, FishingRodTypes fishingRodTypes){
        this.price = price;
        this.productName = productName;
        this.fishingRodTypes = fishingRodTypes;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setId(long id) {
        this.id =id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setFishingRodTypes(FishingRodTypes fishingRodTypes){
        this.fishingRodTypes = fishingRodTypes;
    }

    public FishingRodTypes getFishingRodTypes(){
        return fishingRodTypes;
    }
}
