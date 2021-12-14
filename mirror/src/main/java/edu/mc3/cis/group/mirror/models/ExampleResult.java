package edu.mc3.cis.group.mirror.models;

import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

public class ExampleResult {
    private final int x;
    private final int y;
    private final int output;


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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getOutput() {
        return output;
    }
}
