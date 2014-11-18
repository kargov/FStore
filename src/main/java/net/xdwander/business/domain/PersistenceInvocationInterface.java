package net.xdwander.business.domain;

import java.io.Serializable;

public interface PersistenceInvocationInterface extends Serializable {

	public Object persist(ServiceProviderInterface serviceProvider) throws DomainException;

	public Object getObjectToPersist();
}
