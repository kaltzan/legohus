package PresentationLayer;

import FunctionLayer.Calculator;
import FunctionLayer.Order;
import FunctionLayer.Bricks;
import FunctionLayer.TemporaryException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kristian
 */
public class CalculatorCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws TemporaryException {

        int height = Integer.parseInt(request.getParameter("height"));
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        Order order = new Order(height, length, width);
        Bricks bricks = Calculator.orderCalculator(order);
        request.setAttribute("bricks", bricks);

        return "confirmorder";
    }

}
