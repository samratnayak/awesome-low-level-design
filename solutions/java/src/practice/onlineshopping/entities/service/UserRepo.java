package practice.onlineshopping.entities.service;

import practice.onlineshopping.entities.Shopper;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {
    private Map<String, Shopper> shoppersRepo = new HashMap<>();

    public Map<String, Shopper> getShoppersRepo() {
        return shoppersRepo;
    }

    public void setShoppersRepo(Map<String, Shopper> shoppersRepo) {
        this.shoppersRepo = shoppersRepo;
    }
}
