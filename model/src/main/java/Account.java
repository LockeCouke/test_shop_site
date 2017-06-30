import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;
import supermarketPricing.products.Product;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@RestController
@EnableAutoConfiguration
public class Account {

    @OneToMany(mappedBy = "account")
    private Multiset<Product> bascet = HashMultiset.create();

    @Id
    @GeneratedValue
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

    Set<Product> getProducts(){
        return bascet.elementSet();
    }

    boolean delProduct(Product product){
        return bascet.remove(product);
    }

    boolean delProducts(Product product){
        return bascet.remove(product, bascet.count(product))==0;
    }

    void clearBacket(){
        bascet.clear();
    }

    void addProduct(Product product){
        bascet.add(product);
    }


}
