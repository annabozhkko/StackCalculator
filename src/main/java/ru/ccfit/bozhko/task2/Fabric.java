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
