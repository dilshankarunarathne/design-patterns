### What is Singleton pattern ?

If we want a class to have only one object we can use this pattern.  
Objects that are used for logging, device drivers for printers or registry settings
need to have only one of a kind.  
If there are multiple objects, we may encounter problems like incorrect program
behavior, inconsistent results, etc. 

We can create our resource class with a private constructor. 
And when we need to instantiate it, we can have a single static instance 
and pass it using a `getInstance()` static method. 



    private static Resource resource ;

    private Resource () {
    }

    public static Resource getInstance () {
        if (logger == null) {
            logger = new Logger() ;
        }
        return logger ;
    }

