package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.TemporaryException;
import FunctionLayer.Order;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kristian
 */
public class OrderCommand extends Command {

    

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws TemporaryException  {
        int height = Integer.parseInt(request.getParameter("height"));
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        if(height<6||length < 6 || height <1){
            throw new TemporaryException("house is too small");
        }
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        try {
            LogicFacade.createOrder(user, new Order(height, length, width));
        } catch (TemporaryException ex) {
            throw new TemporaryException("could not save order");
        }
        return "orderconfirmed";
    }

}
