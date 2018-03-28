package FunctionLayer;

/**
 *
 * @author Kristian
 */
public class Bricks {

    int four;
    int two;
    int one;

    public Bricks(int four, int two, int one) {
        this.four = four;
        this.two = two;
        this.one = one;
    }

    public int getFour() {
        return four;
    }

    public int getTwo() {
        return two;
    }

    public int getOne() {
        return one;
    }

    @Override
    public String toString() {
        return "Bricks:" + "four:" + four + ". two:" + two + ". one:" + one + '.';
    }

    
    
    
    
}
