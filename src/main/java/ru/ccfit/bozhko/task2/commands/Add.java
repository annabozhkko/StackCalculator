package ru.ccfit.bozhko.task2.commands;

import ru.ccfit.bozhko.task2.Command;
import ru.ccfit.bozhko.task2.Context;

import java.util.List;
import java.util.Stack;

public class Add implements Command {
    public void calculate(Context context, List<String> parameters){
        Stack stack = context.getStack();
        double sum = (double)stack.pop() + (double)stack.pop();
        stack.push(sum);
    }
}
