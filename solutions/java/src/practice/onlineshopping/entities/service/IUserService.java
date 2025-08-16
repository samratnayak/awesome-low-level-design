package practice.onlineshopping.entities.service;

import practice.onlineshopping.entities.Shopper;
import practice.onlineshopping.entities.strategy.AbstractStrategy;


public interface IUserService {

    Shopper register(Shopper shopper, AbstractStrategy registrationStrategy);

    Shopper getById(String id);
}
