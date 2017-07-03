package supermarketPricing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import supermarketPricing.data.products.Product;
import supermarketPricing.errors.UserNotFoundException;
import supermarketPricing.repository.AccountRepository;
import supermarketPricing.repository.ProductRepository;

import java.util.Collection;

@RestController
@RequestMapping("/{userId}/bascet")
public class BascetController {

    private final AccountRepository accountRepository;

    @Autowired
    BascetController(ProductRepository productRepository, AccountRepository accountRepository){
        this.accountRepository =  accountRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    Collection<Product> getProducts(@PathVariable  Long userId){
        this.valisateUser(userId);
        return this.accountRepository.findOne(userId).getProducts();
    }

    private void valisateUser(@PathVariable Long userId){
        this.accountRepository.findByUserID(userId).orElseThrow(() -> new UserNotFoundException(userId));
    }

    void addProduct(@PathVariable Long userId, @RequestBody Product product){
        this.valisateUser(userId);
        accountRepository.findOne(userId).addProduct(product);
    }

}
