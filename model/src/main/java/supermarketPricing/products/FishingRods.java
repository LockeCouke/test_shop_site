package supermarketPricing.products;

import supermarketPricing.manufacturer.Manufacturer;
import supermarketPricing.products.types.FishingRodTypes;

public class FishingRods implements Product {

    private long productID = 1;
    private double price;
    private String productName;
    private Manufacturer manufacturer;
    private FishingRodTypes fishingRodTypes;

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

    public void setFishingRodTypes(FishingRodTypes fishingRodTypes){
        this.fishingRodTypes = fishingRodTypes;
    }

    public FishingRodTypes getFishingRodTypes(){
        return fishingRodTypes;
    }
}
