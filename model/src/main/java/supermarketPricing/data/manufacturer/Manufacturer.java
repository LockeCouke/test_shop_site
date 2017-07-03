package supermarketPricing.data.manufacturer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import supermarketPricing.data.products.Product;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Manufacturer {

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private Product product;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String history;
    private Date foundationDate;
    private String name;
    private String adress;

    @Enumerated(EnumType.STRING)
    private ManufacturerCountry manufactCountry;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Date getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ManufacturerCountry getManufactCountry() {
        return manufactCountry;
    }

    public void setManufactCountry(ManufacturerCountry manufactCountry) {
        this.manufactCountry = manufactCountry;
    }
}
