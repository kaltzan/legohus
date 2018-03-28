package PresentationLayer;

import FunctionLayer.TemporaryException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put("login", new LoginCommand() );
        commands.put("register", new RegisterCommand() );
        commands.put("help", new HelpCommand());
        commands.put("orderpage", new StartOrder());
        commands.put("order", new OrderCommand());
        commands.put("showorders", new ShowOrderCommand());
        commands.put("showallorders", new ShowAllOrdersCommand());
        
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }
    
    
    

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws TemporaryException;

}
