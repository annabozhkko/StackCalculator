package ru.ccfit.bozhko.task2.commands;

import org.junit.Assert;
import org.junit.Test;
import ru.ccfit.bozhko.task2.Context;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DivideTest {
    @Test
    public void operationTest(){
        Divide divide = new Divide();
        Context context = new Context();
        Stack<Double> stack = context.getStack();
        stack.push(3.0);
        stack.push(6.0);
        String[] commandLine = new String[2];
        List<String> list = Arrays.asList(commandLine);
        divide.calculate(context, list);
        Assert.assertEquals(stack.pop(), 2.0, 0);
    }

    @Test
    public void testDivisionByZero(){
        Divide divide = new Divide();
        Context context = new Context();
        Stack<Double> stack = context.getStack();
        stack.push(0.0);
        stack.push(5.0);
        String[] commandLine = new String[2];
        List <String> list = Arrays.asList(commandLine);
        Assert.assertThrows(ArithmeticException.class, () -> divide.calculate(context, list));
    }
}
