package ru.ccfit.bozhko.task2.commands;

import ru.ccfit.bozhko.task2.Command;
import ru.ccfit.bozhko.task2.Context;

import java.util.List;
import java.util.Stack;

public class Divide implements Command {
    public void calculate(Context context, List<String> parameters) throws ArithmeticException{
        Stack stack = context.getStack();
        double num1 = (double)stack.pop();
        double num2 = (double)stack.pop();
        if(num2 == 0){
            throw new ArithmeticException();
        }
        double res = num1 / num2;
        stack.push(res);
    }
}
