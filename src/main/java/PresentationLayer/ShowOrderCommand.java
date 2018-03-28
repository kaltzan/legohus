package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.LogicFacade;
import FunctionLayer.TemporaryException;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kristian
 */
public class ShowOrderCommand extends Command {

    public ShowOrderCommand() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws TemporaryException {
        User user = (User) request.getSession().getAttribute("user");
        List<Order> orders;

        orders = LogicFacade.getOrders(user);
        request.setAttribute("orders", orders);

        return "showorders";
    }

}
