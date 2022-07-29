package ru.ccfit.bozhko.task2.commands;

import ru.ccfit.bozhko.task2.Command;
import ru.ccfit.bozhko.task2.Context;

import java.util.List;
import java.util.Stack;

public class Multiply implements Command {
    public void calculate(Context context, List<String> parameters){
        Stack stack = context.getStack();
        double res = (double)stack.pop() * (double)stack.pop();
        stack.push(res);
    }
}