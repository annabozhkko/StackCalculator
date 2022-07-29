package ru.ccfit.bozhko.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.bozhko.task2.CalcException;
import ru.ccfit.bozhko.task2.Context;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PushTest {
    @Test
    public void operationTest() throws CalcException {
        String[] commandLine = new String[3];
        commandLine[1] = "4";

        Push push = new Push();
        Context context = new Context();
        Stack<Double> stack = context.getStack();
        stack.push(2.0);
        stack.push(3.0);
        List<String> list = Arrays.asList(commandLine);
        push.calculate(context, list);
        Assert.assertEquals(stack.pop(), 4.0, 0);
    }
}