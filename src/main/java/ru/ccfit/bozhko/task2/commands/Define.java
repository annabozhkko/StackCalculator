package ru.ccfit.bozhko.task2.commands;

import ru.ccfit.bozhko.task2.CalcException;
import ru.ccfit.bozhko.task2.Command;
import ru.ccfit.bozhko.task2.Context;

import java.util.Map;
import java.util.List;

public class Define implements Command {
    private String parameter;
    private String num;

    public void calculate(Context context, List<String> parameters) throws CalcException{
        if(parameters.size() < 3)
            throw new CalcException("Not enough parameters in DEFINE");
        parameter = parameters.get(1);
        num = parameters.get(2);
        Map listDefinitions = context.getListDefinitions();
        char array[] = num.toCharArray();
        if(array[0] > '9' || array[0] < '0'){
            throw new CalcException("Wrong parameter in DEFINE");
        }
        double numDouble = Double.parseDouble(num);
        listDefinitions.put(parameter, numDouble);
    }
}
