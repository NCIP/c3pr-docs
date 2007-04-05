package edu.duke.cabig.ctms;

import org.apache.servicemix.MessageExchangeListener;
import org.apache.servicemix.jbi.resolver.EndpointResolver;
import org.apache.servicemix.client.Destination;
import org.apache.servicemix.client.ServiceMixClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.jbi.component.ComponentLifeCycle;
import javax.jbi.component.ComponentContext;
import javax.jbi.JBIException;
import javax.jbi.messaging.*;
import javax.management.ObjectName;
import javax.xml.namespace.QName;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: kherm
 * Date: Mar 22, 2007
 * Time: 12:36:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class RoutingEngine implements ComponentLifeCycle, MessageExchangeListener {
    private ComponentContext context;
    private ObjectName extensionMBeanName;
    ServiceMixClient client;

    private Log logger = LogFactory.getLog(ESBRegistryImpl.class);

    public void init(ComponentContext componentContext) throws JBIException {
        this.context = context;
        logger.info("Initializing RoutingEngine");

    }

    public void shutDown() throws JBIException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void start() throws JBIException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void stop() throws JBIException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public ObjectName getExtensionMBeanName() {
        return extensionMBeanName;
    }

    public void setExtensionMBeanName(ObjectName extensionMBeanName) {
        this.extensionMBeanName = extensionMBeanName;
    }


    public void onMessageExchange(MessageExchange exchange) throws MessagingException {
        NormalizedMessage message = exchange.getMessage("in");

        QName service = new QName("http://semanticbits.com/esb/ctms", "registeration-broadcaster");
        EndpointResolver resolver = client.createResolverForService(service);
            

        Map properties = new HashMap();
         String epr = "http://127.0.0.1:9080/wsrf/services/cagrid/RegistrationConsumer?wsdl";
        properties.put("epr", epr);

        try {
            logger.info("Sending message to " + epr);
            client.send(resolver,null,properties,message);
        } catch (JBIException e) {
            logger.error("Error routing",e);
            throw new MessagingException(e.getMessage());
        }

    }
}
