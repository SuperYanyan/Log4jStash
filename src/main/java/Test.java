import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Test.class);
        logger.info("This is the first log4j log to logstash!");
        logger.debug("This is the second debug log to logstash!");

    }

}
