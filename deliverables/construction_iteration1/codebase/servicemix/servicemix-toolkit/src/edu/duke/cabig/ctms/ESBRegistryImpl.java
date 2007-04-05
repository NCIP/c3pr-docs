package edu.duke.cabig.ctms;


import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;


public class ESBRegistryImpl implements ESBRegistry {

    private Log logger = LogFactory.getLog(ESBRegistryImpl.class);

    public void createOrUpdateSubscription(String messageType, String consumingService, String endpoint) {
        logger.info("Received Subscription");
    }

    public void deleteSubscription(String messageType, String endpoint) {
        //ToDo delte subscriptions
    }
}
