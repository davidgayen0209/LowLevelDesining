package DesignPatterns.Structural;

public class ConsoleLogger implements  Logger{
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}

// Core functionality, must remain untouched forever

// Abstract Decorator: [To create N number of decorators for the base class consoleLogger]

abstract class LoggerDecorator implements Logger{
    protected Logger logger;

    LoggerDecorator(Logger logger){
        this.logger = logger;
    }
}

 class TimeStampLogger extends LoggerDecorator{
    TimeStampLogger(Logger logger){
        super(logger);
    }

     @Override
     public void log(String msg) {
        String message =  System.currentTimeMillis() + " : " + msg;
        logger.log(message);
     }
 }

 class LevelLogger extends LoggerDecorator{
    private  String level;
     LevelLogger(Logger logger, String level){
        super(logger);
        this.level = level;
    }

     @Override
     public void log(String msg) {
         logger.log("[" + level + "]" + msg);
     }
 }

 class JsonLogger extends  LoggerDecorator{
    JsonLogger(Logger logger){
        super(logger);
    }

     @Override
     public void log(String msg) {
        String json = "{ :/log}" + msg + ": /";
         logger.log(json);
     }
 }