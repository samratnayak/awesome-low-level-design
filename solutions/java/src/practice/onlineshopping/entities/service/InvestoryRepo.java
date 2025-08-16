package practice.onlineshopping.entities.service;

import practice.onlineshopping.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class InvestoryRepo {

    Map<String, Integer> inventory = new HashMap<>();

    public boolean updateInventory(String productId, int qty){
        if (inventory.get(productId) != null && inventory.get(productId) >= qty){
            inventory.put(productId, inventory.get(productId) - qty);
            return true;
        }
        return false;
    }

    public Map<String, Integer> getInventory(){
        return inventory;
    }

    public void addItemToInventory(Product product, int qty){
        inventory.putIfAbsent(product.getId(), 0);
        inventory.put(product.getId(), inventory.get(product.getId())+qty);
    }


}
