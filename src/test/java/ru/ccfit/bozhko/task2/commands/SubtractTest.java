package ru.ccfit.bozhko.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.bozhko.task2.Context;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SubtractTest {
    @Test
    public void operationTest(){
        Subtract subtract = new Subtract();
        Context context = new Context();
        Stack<Double> stack = context.getStack();
        stack.push(2.0);
        stack.push(6.0);
        String[] commandLine = new String[2];
        List<String> list = Arrays.asList(commandLine);
        subtract.calculate(context, list);
        Assert.assertEquals(stack.pop(), 4.0, 0);
    }
}