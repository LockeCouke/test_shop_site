package supermarketPricing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/products", "/{userID}/products"})
public class ProductsController {

}