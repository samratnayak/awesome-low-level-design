package practice.onlineshopping.entities.service;

import practice.onlineshopping.entities.Shopper;
import practice.onlineshopping.entities.strategy.AbstractStrategy;
import java.util.Objects;

public class UserService implements IUserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public Shopper register(Shopper shopper, AbstractStrategy registrationStrategy) {
        Shopper savedUser = registrationStrategy.register(shopper);
        if (Objects.isNull(savedUser)){
            System.out.println("********Error, saving failed***********");
        }
        userRepo.getShoppersRepo().put(savedUser.getId(), savedUser);
        return savedUser;
    }

    @Override
    public Shopper getById(String id) {
        return userRepo.getShoppersRepo().get(id);
    }
}
