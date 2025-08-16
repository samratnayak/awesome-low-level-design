package practice.onlineshopping.entities.strategy;


import practice.onlineshopping.entities.Shopper;

public interface RegistrationStrategy {
    Shopper register(Shopper shopper);
    boolean isValidUser(Shopper shopper);
}
