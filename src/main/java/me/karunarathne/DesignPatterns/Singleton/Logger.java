package me.karunarathne.DesignPatterns.Singleton;

public class Logger {
    private Logger logger ;

    private Logger () {

    }

    public Logger getInstance () {
        if (logger == null) {
            logger = new Logger() ;
        }
        return logger ;
    }
}
