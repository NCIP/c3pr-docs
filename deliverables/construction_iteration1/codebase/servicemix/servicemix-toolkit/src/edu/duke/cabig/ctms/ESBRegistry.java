package edu.duke.cabig.ctms;

public interface ESBRegistry {

    public static final String GRID_SERVICE = "grid";
    public static final String WEB_SERVICE = "ws";

    /**
     * create a subscription for a message
     * @param messageType XML Type of the message
     * @param consumingService  service type eg. ESBRegistry.GRID_SERVICE
     * @param endpoint Consuming service endpoint EPR/URL etc.
     */
    public void createOrUpdateSubscription(String messageType,
                                           String consumingService,
                                           String endpoint);

    public void deleteSubscription(String messageType, String endpoint);
}