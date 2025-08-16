package practice.onlineshopping.entities.strategy;

import practice.onlineshopping.entities.Shopper;

public abstract class AbstractStrategy {

    protected RegistrationStrategy registrationStrategy;

    public Shopper register(Shopper shopper) {
        if (registrationStrategy.isValidUser(shopper)){
            return registrationStrategy.register(shopper);
        } else {
            System.out.println("shopper Validation failed........");
        }
        return null;
    }

}
