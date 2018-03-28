package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 *
 * @author kasper
 */
public class LogicFacade {

    public static User login(String email, String password) throws TemporaryException {
        return UserMapper.login(email, password);
    }

    public static User createUser(String email, String password) throws TemporaryException {
        User user = new User(email, password, "customer");
        UserMapper.createUser(user);
        return user;
    }

    public static void createOrder(User user, Order order) throws TemporaryException {
        OrderMapper.createOrder(order, user);

    }

    public static List<Order> getOrders(User user) throws TemporaryException {
        return OrderMapper.getOrders(user);

    }

    public static List<Order> getAllOrders() throws TemporaryException {
        return OrderMapper.getAllOrders();
    }

}
