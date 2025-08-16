package practice.onlineshopping.entities.strategy;

import practice.onlineshopping.entities.Shopper;

public class OtpRegistrationStrategy extends AbstractStrategy implements RegistrationStrategy {


    @Override
    public Shopper register(Shopper shopper) {
        System.out.println("registering "+shopper.getMobile()+" with mobile number ");
        shopper.setId(""+ Math.random() * 100+"-"+ shopper.getMobile());
        System.out.println("id "+shopper.getId());
        return shopper;
    }

    @Override
    public boolean isValidUser(Shopper shopper) {
        return shopper.getMobile() != null &&  shopper.getMobile().matches("\\+91[0-9]{10}");
    }
}
