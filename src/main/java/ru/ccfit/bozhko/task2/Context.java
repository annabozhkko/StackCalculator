package ru.ccfit.bozhko.task2;

import java.util.HashMap;
import java.util.Stack;
import java.util.Map;

public class Context {
    private Stack<Double> stack = new Stack<>();
    private Map<String, Double> listDefinitions = new HashMap<>();
    public Stack getStack() {return stack;}
    public Map getListDefinitions(){return listDefinitions;}
}
