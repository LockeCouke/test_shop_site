package supermarketPricing.products;


import supermarketPricing.manufacturer.Manufacturer;

public interface Product {
    //TODO: Добавить дефолтные методы для сетеров и гетеров
    Manufacturer getManufacturer();
    double getPrice();
    long getProductID();
    String getMeasure();
    String getProductName();
    void setManufacturer(Manufacturer manufacturer);
    void setProductID(long id);
    void setPrice(double price);
    void setProductName(String name);
}
