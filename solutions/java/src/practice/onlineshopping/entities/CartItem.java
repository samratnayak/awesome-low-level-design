package practice.onlineshopping.entities;

public class CartItem {

    private int quantity;
    private Product product;

    CartItem(Product product, int qty){
        this.product = product;
        this.quantity = qty;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
