package FunctionLayer;

/**
 *
 * @author Kristian
 */
public class Order {

   // height length width
    int height;
    int length;
    int width;
    

    public Order( int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return  "height: " + height + ". length: " + length + ". width:" + width + '.';
    }

    
}
