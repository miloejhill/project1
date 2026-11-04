import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Project {
    
}


class GroceryStore {
    List<Product> productStock;
    Map<ProductType, List<Product>> productFilter;

    GroceryStore(){
        this.productStock = new ArrayList<>();

        this.productFilter = new HashMap<>();
        this.productFilter.put(ProductType.FRUIT, new ArrayList<>());
        this.productFilter.put(ProductType.VEGETABLES, new ArrayList<>());
        this.productFilter.put(ProductType.MEAT, new ArrayList<>());
        this.productFilter.put(ProductType.DAIRY, new ArrayList<>());
        this.productFilter.put(ProductType.FROZEN, new ArrayList<>());
        this.productFilter.put(ProductType.PANTRY, new ArrayList<>());
        this.productFilter.put(ProductType.HOUSEHOLD, new ArrayList<>());
    }
}


enum ProductType {
    FRUIT,      //SELF EXPLANATORY
    VEGETABLES, //SELF EXPLANATORY
    MEAT,       //MEAT & SEAFOOD
    DAIRY,      //MILK, CHEESE, ETC.
    FROZEN,     //FROZEN FOOD
    PANTRY,     //SNACKS & CONFECTIONARY
    HOUSEHOLD,  //CLEANING AND HEALTH
}

class Product {
    protected String productName;
    protected ProductType productType;
    protected double productCost;

    Product(String productName, ProductType productType, double productCost){
        this.productName = productName;
        this.productType = productType;
        this.productCost = productCost;
    }


}

class DiscountProduct extends Product {
    double discountPrice;

    DiscountProduct(String productName, ProductType productType, double productCost){
        super(productName, productType, productCost);
        this.discountPrice = this.productCost -= (this.productCost / 2);

    }
}

class RewardProduct extends Product {
    int rewardValue;

    RewardProduct(String productName, ProductType productType, double productCost, int rewardValue){
        super(productName, productType, productCost);
        this.rewardValue = rewardValue;
    }
}

class ProductLibrary {
    static Product[] LIBRARY = { new Product("Milk", ProductType.DAIRY, 5.99),
    new Product("Lactose Free Milk", ProductType.DAIRY, 4.99),
    new Product("Cheddar Cheese", ProductType.DAIRY, 3.99),
    new Product("Rump Steak", ProductType.MEAT, 11.99),
    new Product("Kiwi Fruit", ProductType.FRUIT, 2.99)
    };
}
