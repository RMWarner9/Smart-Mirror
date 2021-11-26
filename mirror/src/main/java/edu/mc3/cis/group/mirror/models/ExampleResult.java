package edu.mc3.cis.group.mirror.models;

import org.springframework.context.annotation.Bean;

public class ExampleResult {
    private final int x;
    private final int y;
    private final int output;


    public ExampleResult(int x, int y)
    {
        this.x = x;
        this.y = y;

        this.output = x * y;
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
