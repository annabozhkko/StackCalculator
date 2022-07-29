package ru.ccfit.bozhko.task2;

import java.util.HashMap;
import java.util.Properties;
import java.util.Map;
import java.io.InputStream;

public class Fabric {
    private Map<String, Class<?>> commands = new HashMap<>();
    private Properties property = new Properties();

    public Fabric() throws Exception{
        InputStream fin = this.getClass().getClassLoader().getResourceAsStream("commands.properties");
        property.load(fin);
        for(String name : property.stringPropertyNames()) {
            String commandName = property.getProperty(name);
            Class commandClass = Class.forName(commandName);
            commands.put(name, commandClass);
        }
    }

    public Command createCommand(String commandline[]) throws Exception{
        Class commandClass = commands.get(commandline[0]);
        if(commandClass == null){
            return null;
        }
        Command command = (Command)commandClass.getDeclaredConstructor().newInstance();
        return command;
    }
}

//дабл чекет синглтон
//get instanse
//конструктор приват
//переделать
//calculator.calculate
//logger.err
//catch оставить только эксепшн
//в контекст добавить методы поп, пуш, сайз, get val
//убрать гет
//и вызывать в командах
//добавить лоад и что то там
//лоад загружает данные из файла
//сэйв создает файл с текущими значениями на стеке
//если со стека берем, проверям что на стеке есть
//в каждомй команде проверять, метод сайз
//