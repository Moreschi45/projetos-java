package org.acme.conf;

import java.util.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LogConfig {
    
    private static final Logger logging = Logger.getLogger(LogConfig.class.getName());

    public void logInfo(String message) {
        logging.info(message);
    }

    public void logError(String message) {
        logging.severe(message);
    }

    public void logWarning(String message) {
        logging.warning(message);
    }
    
}
