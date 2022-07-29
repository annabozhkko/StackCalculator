package ru.ccfit.bozhko.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.bozhko.task2.Context;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PopTest {
    @Test
    public void operationTest(){
        Pop pop = new Pop();
        Context context = new Context();
        Stack<Double> stack = context.getStack();
        stack.push(2.0);
        stack.push(3.0);
        String[] commandLine = new String[2];
        List<String> list = Arrays.asList(commandLine);
        pop.calculate(context, list);
        Assert.assertEquals(stack.pop(), 2.0, 0);
    }
}