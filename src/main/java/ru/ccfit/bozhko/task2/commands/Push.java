package ru.ccfit.bozhko.task2.commands;

import ru.ccfit.bozhko.task2.CalcException;
import ru.ccfit.bozhko.task2.Command;
import ru.ccfit.bozhko.task2.Context;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Push implements Command {
    private String parameter;

    public void calculate(Context context, List<String> parameters) throws CalcException {
        if(parameters.size() < 2)
            throw new CalcException("Not enough parameters in PUSH");
        parameter = parameters.get(1);
        Stack stack = context.getStack();
        Map listDefinitions = context.getListDefinitions();
        if(listDefinitions.get(parameter) != null)
            stack.push(listDefinitions.get(parameter));
        else{
            char array[] = parameter.toCharArray();
            if(array[0] > '9' || array[0] < '0'){
                throw new CalcException("Not found parameter " + parameter);
            }
            double num = Double.parseDouble((parameter));
            stack.push(num);
        }
    }
}
