package edu.mc3.cis.group.mirror.models;
import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import org.springframework.http.HttpStatus;

/**
 * ExampleResult class is a class that was written as an example of passing complex data types (Objects) to the controllers
 * It holds an x and y value int values and multiplies them together for an output value
 */
public class ExampleResult {
    private final int x;
    private final int y;
    private final int output;


    /**
     * ExampleResult constructor that sets the class's values.
     * @param x int to be multiplied
     * @param y int to be multiplied
     * @throws MagicMirrorException exception to be thrown if the user tries to multiply negative numbers
     */
    public ExampleResult(int x, int y) throws MagicMirrorException
    {

        if (x < 0 || y < 0)
        {
            throw new MagicMirrorException(HttpStatus.BAD_REQUEST, new Throwable().getCause() , "Please only enter positive numbers");
        }

        else{
            this.x = x;
            this.y = y;
            this.output = x * y;
        }
    }

    /**
     * getX method returns the X value
     * @return int value of x
     */
    public int getX() {
        return x;
    }

    /**
     * getY method returns the Y value
     * @return int value of y
     */
    public int getY() {
        return y;
    }

    /**
     * getOutput method returns the output value
     * @return int value of x
     */
    public int getOutput() {
        return output;
    }
}
