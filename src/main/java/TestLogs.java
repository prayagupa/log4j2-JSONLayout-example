import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogs {

    static Logger logger = LogManager.getLogger(TestLogs.class);

    public static void main(String[] args) {
        logger.info("key:\"move one mate, sooner\"");
    }
}
