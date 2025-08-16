package practice.onlineshopping.entities.service;

import practice.onlineshopping.entities.Cart;

public interface IOrderService {

    boolean checkout(Cart cart);
}
