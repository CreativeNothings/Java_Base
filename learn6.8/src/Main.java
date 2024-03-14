import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        //使用JDK Logging（日志）
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out");
        logger.fine("ignored");
        logger.severe("process will be terminated...");
    }
}