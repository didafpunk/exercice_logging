package be.eafcuccle.nordinne;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.trace("Message TRACE");
        logger.debug("Message DEBUG");
        logger.info("Message INFO");
        logger.warn("Message WARN");
        logger.error("Message ERROR");
    }
}
