package entities;

import java.util.Locale;

/**
 * Should have the control and the logic to create the product objects
 */

public class ProductFactory {
    public Product createProduct(String category) throws IllegalAccessException {

        switch (category.toLowerCase()){
            case "electronics" :
                return new ElectronicsProduct();
            case "clothing" :
                return new ClothingProduct();
            default:
                throw  new IllegalAccessException("Invalid category asked : "+ category);
        }
    }
}
