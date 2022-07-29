package ru.ccfit.bozhko.task2;

import java.util.List;

public interface Command {
    void calculate(Context context, List<String> parameters) throws CalcException;
}
