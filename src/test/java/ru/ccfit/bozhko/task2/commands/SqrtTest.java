package ru.ccfit.bozhko.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.bozhko.task2.Context;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SqrtTest {
    @Test
    public void operationTest(){
        Sqrt sqrt = new Sqrt();
        Context context = new Context();
        Stack<Double> stack = context.getStack();
        stack.push(25.0);
        String[] commandLine = new String[2];
        List<String> list = Arrays.asList(commandLine);
        sqrt.calculate(context, list);
        Assert.assertEquals(stack.pop(), 5.0, 0);
    }
}