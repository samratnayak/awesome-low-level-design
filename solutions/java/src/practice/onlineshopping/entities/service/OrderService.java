package practice.onlineshopping.entities.service;

import practice.onlineshopping.entities.Cart;
import practice.onlineshopping.entities.CartItem;

public class OrderService implements IOrderService{

    private final InvestoryRepo investoryRepo;

    public OrderService(InvestoryRepo investoryRepo){
        this.investoryRepo = investoryRepo;
    }

    @Override
    public boolean checkout(Cart cart) {
        System.out.println("taking order..");
        boolean success = false;
        for (CartItem item : cart.getCartItems()){
            boolean isSuccess = investoryRepo.updateInventory(item.getProduct().getId(), item.getQuantity());
            if (isSuccess){
                System.out.println("item "+item.getProduct().getProductName()+" qty "+item.getQuantity()+" added ");
            } else {
                System.out.println("Not available, item "+item.getProduct().getProductName()+" qty "+item.getQuantity());
            }
            success = isSuccess || success;
        }
        return success;
    }
}
