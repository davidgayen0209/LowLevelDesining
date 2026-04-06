package DesignPatterns;

public class SingleTonDemo {
    public static void main(String[] args) {

        // ---------- 1. SINGLETON ----------
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.logInfo("System started");
        logger2.logError("Something failed");

        System.out.println("Same instance: " + (logger1 == logger2));
        System.out.println("Total logs: " + logger1.getLogCount());

    }
}
 class Logger{
    private static Logger Instance;

    int logCount = 0;

    private Logger(){

    }

    public static Logger getInstance(){
        if(Instance == null){
            Instance = new Logger();

            synchronized (Logger.class){
                if(Instance == null){
                    Instance = new Logger();
                }
            }
        }

        return Instance;
    }

    public void logInfo(String msg){
        logCount++;
        System.out.println("INFO :" + msg);
    }

    public void logError(String msg){
        logCount++;
        System.out.println("ERROR :" + msg);
    }

    public int getLogCount(){
        return logCount;
    }

}