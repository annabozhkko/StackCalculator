package ru.ccfit.bozhko.task2.commands;

import ru.ccfit.bozhko.task2.Command;
import ru.ccfit.bozhko.task2.Context;

import java.util.List;
import java.util.Stack;

public class Print implements Command {
    public void calculate(Context context, List<String> parameters){
        Stack stack = context.getStack();
        System.out.println(stack.peek());
    }
}