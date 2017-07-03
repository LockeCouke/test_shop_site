package supermarketPricing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import supermarketPricing.data.products.Product;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UserAccount {

    @OneToMany(mappedBy = "account")
    private Multiset<Product> bascet = HashMultiset.create();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonIgnore
    private String password;
    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Product> getProducts(){
        return bascet.elementSet();
    }

    public boolean delProduct(Product product){
        return bascet.remove(product);
    }

    public boolean delProducts(Product product){
        return bascet.remove(product, bascet.count(product))==0;
    }

    public void clearBacket(){
        bascet.clear();
    }

    public void addProduct(Product product){
        bascet.add(product);
    }

}
