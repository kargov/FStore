package net.xdwander.business.domain;



import java.util.Collections;
import java.util.List;

/**
 * Parent class for domain exceptions.
 *
 */
public abstract class DomainException extends Exception {
	
	private static final long serialVersionUID = 1L;
	Enum serviceExceptionMessage;
	String brokenObject;
	List<Enum> enumReasons;
	List<String> reasons;
	
    public DomainException( Throwable t ) {
        super(t);
    }
    
    public Enum getServiceExceptionMessage(){
		return serviceExceptionMessage;
	}
	
	public String getBrokenObject() {
		return brokenObject;
	}
	
	public List<Enum> getEnumReasons(){
		if (enumReasons==null){
			return Collections.emptyList();
		}
		return enumReasons;
	}
	
	public List<String> getStringReasons() {
		return reasons;
	}

}
