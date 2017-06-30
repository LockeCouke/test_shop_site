import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import supermarketPricing.products.Product;

import java.util.Set;

@RestController
@EnableAutoConfiguration
public class Bascet {
    private Multiset<Product> bascet = HashMultiset.create();

    @RequestMapping(method = RequestMethod.GET, value = "/MyBascet")
    Set<Product> getProducts(){
        return bascet.elementSet();
    }
}
