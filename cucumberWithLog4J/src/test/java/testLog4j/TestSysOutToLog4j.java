package testLog4j;
 
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import log4j.SystemOutToLog4j;
 
public class TestSysOutToLog4j {
      
    final static Logger logger = Logger.getLogger(TestSysOutToLog4j.class.getName());
     
    static {
        SystemOutToLog4j.enableForClass(TestSysOutToLog4j.class);
    }
     
    public static void main(String[] args) {
    	
    	String log4jConfPath = System.getProperty("user.dir") + "/log4j.properties";
    	PropertyConfigurator.configure(log4jConfPath);
    	
        logger.debug("Hello this is a debug message");
        System.out.println("Print In Log File");
        logger.info("Hello this is a info message - Nikitha");
        logger.error("Issue is logged - New Data");
    }
}