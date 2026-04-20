package DesignPatterns.Structural;

public class DecoratorDemo {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        consoleLogger.log("David is practicing Design patterns");
        TimeStampLogger timeStampLogger = new TimeStampLogger(consoleLogger);
        timeStampLogger.log("current time is 3:11AM");
    }
}

