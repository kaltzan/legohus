package FunctionLayer;

/**
 *
 * @author Kristian
 */
public class Calculator {

    public static Bricks orderCalculator(Order order) throws TemporaryException {
        int height = order.getHeight();
        int length = order.getLength();
        int width = order.getWidth();
        int four;
        int two = 0;
        int one = 0;

        if (length < 6 || width < 6 || height < 1) {
            throw new TemporaryException("one of the walls are too short");
        }                               
        if (length % 2 == 1) {
            length -= 1;
            one += 2;
        }
        if (width % 2 == 1) {
            width -= 1;
            one += 2;
        }

        four = ((length * 2) + (width * 2) - (4 * 2)) / 4;
        
        four *= height;
        two *= height;
        one *= height;
        
        Bricks bricks = new Bricks(four, two, one);
        return bricks;
    }
}
