package me.karunarathne.DesignPatterns.Singleton;

public class Logger {
    private Logger logger ;

    private Logger () {
    }

    public static Logger getInstance () {
        if (logger == null) {
            logger = new Logger() ;
        }
        return logger ;
    }
}
