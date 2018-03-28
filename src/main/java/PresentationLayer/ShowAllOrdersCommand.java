package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.LogicFacade;
import FunctionLayer.TemporaryException;
import FunctionLayer.Order;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kristian
 */
public class ShowAllOrdersCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws TemporaryException {

   
            List<Order> orders = LogicFacade.getAllOrders();
            request.setAttribute("orders", orders);
            return "showallorders";
     



        }





    }


