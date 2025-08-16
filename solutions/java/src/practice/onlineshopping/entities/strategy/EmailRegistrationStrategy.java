package practice.onlineshopping.entities.strategy;

import practice.onlineshopping.entities.Shopper;

public class EmailRegistrationStrategy extends AbstractStrategy implements RegistrationStrategy {
    @Override
    public Shopper register(Shopper shopper) {
        System.out.println("registering "+shopper.getEmail()+" with email");
        shopper.setId(""+ ((int ) Math.random() * 100)+"-"+ shopper.getEmail());
        System.out.println("id "+shopper.getId());
        return shopper;
    }

    @Override
    public boolean isValidUser(Shopper shopper) {
        return shopper.getEmail() != null;
    }
}
