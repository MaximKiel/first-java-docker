package docker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Start {

    private static final Logger logger = LogManager.getLogger(Start.class);

    public static void main(String[] args) {
        logger.error("Hello docker!");
    }
}
