package supermarketPricing.data.products;


import supermarketPricing.data.manufacturer.Manufacturer;

public interface Product {
    //TODO: добавить @column аннотации к нужным полям.
    Manufacturer getManufacturer();
    double getPrice();
    Long getId();
    String getProductName();
    void setManufacturer(Manufacturer manufacturer);
    void setId(Long id);
    void setPrice(double price);
    void setProductName(String name);
}
