package ru.ccfit.bozhko.task2;

import java.io.*;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String args[]) {
        logger.info("Main begin");
        InputStream fstream = System.in;
        BufferedReader reader;
        Fabric fabric;
        try {
            if (args.length > 0)
                fstream = new FileInputStream(args[0]);
            InputStreamReader fin = new InputStreamReader(fstream);
            reader = new BufferedReader(fin);
            fabric = new Fabric();
            logger.info("Created map commands");
        } catch (Exception exp) {
            logger.info(exp.getMessage());
            return;
        }
        String line;
        Context context = new Context();
        while(true) {
            try {
                if((line = reader.readLine()) == null)
                    break;
                if(line.isEmpty())
                    break;
                logger.info("Read command");
                if (line.startsWith("#"))
                    continue;
                String[] commandLine = line.split(" ");
                Command command = fabric.createCommand(commandLine);
                logger.info("Created command");
                List<String> list = Arrays.asList(commandLine);
                command.calculate(context, list);
                logger.info("Command executed");
            } catch (EmptyStackException exp) {
                logger.info("Stack is empty");
            } catch (ArithmeticException exp) {
                logger.info("Division by zero");
            } catch (CalcException exp) {
                logger.info(exp.getMessage());
            } catch (Exception exp) {
                logger.info(exp.getMessage());
            }
        }
        logger.info("Main end");
    }
}
