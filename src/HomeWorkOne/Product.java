package HomeWorkOne;

import java.util.Objects;
public class Product {
    private final String productName;
    private final double price;



    public Product(String productName, double price, double weight, int quantity){
        if (productName != null) {
            this.productName = productName;
        } else {
            throw new RuntimeException("Не полностью введена информация");
        }
        if (price != 0) {
            this.price = price;
        } else {
            throw new RuntimeException("Не полностью введена информация");
        }


    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }

    @Override
    public String toString() {
        return "Продукт: " + productName + ", цена " + price  ;


    }
}
