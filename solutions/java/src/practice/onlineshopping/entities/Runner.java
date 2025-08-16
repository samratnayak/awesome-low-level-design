package practice.onlineshopping.entities;

import practice.onlineshopping.entities.service.*;
import practice.onlineshopping.entities.strategy.EmailRegistrationStrategy;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Shopper shopper = new Shopper();
        shopper.setEmail("abc.email.com");
        UserRepo userRepo = new UserRepo();
        IUserService userService = new UserService(userRepo);
        userService.register(shopper, new EmailRegistrationStrategy());

        Product iphone = new Product();
        iphone.setId("1");
        iphone.setProductName("I-phone 17");
        iphone.setProductCategory(ProductCategory.ELECTRONICS);

        InvestoryRepo repo = new InvestoryRepo();
        repo.addItemToInventory(iphone, 2);
        System.out.println("repo "+repo.getInventory());

        Cart cart = new Cart();
        cart.setCartItems(List.of(new CartItem(iphone, 3)));

        IOrderService orderService = new OrderService(repo);
        boolean isSuccess = orderService.checkout(cart);
        System.out.println("isSuccess "+isSuccess);


    }
}
