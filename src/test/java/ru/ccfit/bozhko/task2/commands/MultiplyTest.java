package ru.ccfit.bozhko.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.bozhko.task2.Context;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MultiplyTest {
    @Test
    public void operationTest(){
        Multiply multiply = new Multiply();
        Context context = new Context();
        Stack<Double> stack = context.getStack();
        stack.push(4.0);
        stack.push(3.0);
        String[] commandLine = new String[2];
        List<String> list = Arrays.asList(commandLine);
        multiply.calculate(context, list);
        Assert.assertEquals(stack.pop(), 12.0, 0);
    }
}