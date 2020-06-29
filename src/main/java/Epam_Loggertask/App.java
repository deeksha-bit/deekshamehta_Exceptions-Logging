package Epam_Loggertask;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class App
{

    static Logger Logger = org.apache.log4j.Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        Logger.debug("This is debug");
        Logger.info("This is info");
        Logger.warn("This is warn");
        Logger.error("This is error");
        Logger.fatal("This is fatal");
    }
}
