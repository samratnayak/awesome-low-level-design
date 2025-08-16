package practice.onlineshopping.entities;

import java.util.List;

public class Cart {

    private Shopper shopper;
    private List<CartItem> cartItems;

    public Shopper getShopper() {
        return shopper;
    }

    public void setShopper(Shopper shopper) {
        this.shopper = shopper;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
