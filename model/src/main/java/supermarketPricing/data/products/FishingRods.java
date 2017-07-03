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
    private Long id;

    @JsonIgnore
    @ManyToOne
    private UserAccount userAccount;

    @ManyToOne
    private Manufacturer manufacturer;

    @Enumerated(EnumType.STRING)
    private FishingRodTypes fishingRodTypes;

    private double price;
    private String productName;

    public FishingRods(int price, String productName, FishingRodTypes fishingRodTypes, Manufacturer manufacturer){
        this.price = price;
        this.productName = productName;
        this.fishingRodTypes = fishingRodTypes;
        this.manufacturer =  manufacturer;
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

    public void setFishingRodTypes(FishingRodTypes fishingRodTypes){
        this.fishingRodTypes = fishingRodTypes;
    }

    public FishingRodTypes getFishingRodTypes(){
        return fishingRodTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FishingRods that = (FishingRods) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (manufacturer != null ? !manufacturer.equals(that.manufacturer) : that.manufacturer != null) return false;
        if (fishingRodTypes != that.fishingRodTypes) return false;
        return productName != null ? productName.equals(that.productName) : that.productName == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + (fishingRodTypes != null ? fishingRodTypes.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        return result;
    }
}
