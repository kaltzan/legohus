package DBAccess;

import FunctionLayer.TemporaryException;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Kristian
 */
public class OrderMapper {

    public static void createOrder(Order order, User user) throws TemporaryException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders (userid, height, length, width) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, user.getId());
            ps.setInt(2, order.getHeight());
            ps.setInt(3, order.getLength());
            ps.setInt(4, order.getWidth());
            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            throw new TemporaryException(ex.getMessage());
        }

    }

    public static List<Order> getAllOrders() throws TemporaryException {

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            List<Order> orders = new ArrayList<>();
            while (rs.next()) {

                int height = rs.getInt("height");
                int length = rs.getInt("length");
                int width = rs.getInt("width");

                Order order = new Order(height, length, width);
                orders.add(order);
            }
            return orders;

        } catch (SQLException | ClassNotFoundException ex) {
            throw new TemporaryException(ex.getMessage());
        }
    }

    public static List<Order> getOrders(User user) throws TemporaryException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders where userid = ?";

            PreparedStatement ps = con.prepareStatement(SQL);

            ps.setInt(1, user.getId());

            ResultSet rs = ps.executeQuery();
            List<Order> orders = new ArrayList<>();
            while (rs.next()) {

                int height = rs.getInt("height");
                int length = rs.getInt("length");
                int width = rs.getInt("width");

                Order order = new Order(height, length, width);
                orders.add(order);
            }
            return orders;

        } catch (SQLException | ClassNotFoundException ex) {
            throw new TemporaryException(ex.getMessage());
        }
    }

}
