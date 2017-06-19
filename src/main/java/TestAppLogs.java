import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.AppLogEvent;

public class TestAppLogs {

    static Logger logger = LogManager.getLogger(TestAppLogs.class);

    public static void main(String[] args) {
        logger.info(new AppLogEvent().put("key", "streaming-world")
        .put("someInt", 1000l).toString());

        logger.error(new AppLogEvent().put("key", "streaming-world")
                .put("error", new Exception("something bad")).toString());
    }
}
