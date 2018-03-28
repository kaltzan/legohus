package PresentationLayer;

import FunctionLayer.TemporaryException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kristian
 */
public class HelpCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws TemporaryException {
        return "help";
    }

}
