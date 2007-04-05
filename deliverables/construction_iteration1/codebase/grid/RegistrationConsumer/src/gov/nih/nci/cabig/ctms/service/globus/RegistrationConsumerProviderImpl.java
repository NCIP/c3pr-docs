package gov.nih.nci.cabig.ctms.service.globus;

import gov.nih.nci.cabig.ctms.service.RegistrationConsumerImpl;

import java.rmi.RemoteException;

/** 
 * DO NOT EDIT:  This class is autogenerated!
 *
 * This class implements each method in the portType of the service.  Each method call represented
 * in the port type will be then mapped into the unwrapped implementation which the user provides
 * in the RegistrationConsumerImpl class.  This class handles the boxing and unboxing of each method call
 * so that it can be correclty mapped in the unboxed interface that the developer has designed and 
 * has implemented.  Authorization callbacks are automatically made for each method based
 * on each methods authorization requirements.
 * 
 * @created by Introduce Toolkit version 1.0
 * 
 */
public class RegistrationConsumerProviderImpl{
	
	RegistrationConsumerImpl impl;
	
	public RegistrationConsumerProviderImpl() throws RemoteException {
		impl = new RegistrationConsumerImpl();
	}
	

	public gov.nih.nci.cabig.ctms.stubs.RegisterResponse register(gov.nih.nci.cabig.ctms.stubs.RegisterRequest params) throws RemoteException, gov.nih.nci.cabig.ctms.stubs.types.InvalidRegistration, gov.nih.nci.cabig.ctms.stubs.types.RegistrationFailed {
		RegistrationConsumerAuthorization.authorizeRegister();
		gov.nih.nci.cabig.ctms.stubs.RegisterResponse boxedResult = new gov.nih.nci.cabig.ctms.stubs.RegisterResponse();
		impl.register(params.getRegistration().getRegistration());
		return boxedResult;
	}

}
