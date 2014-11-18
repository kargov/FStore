package net.xdwander.business.domain.exceptions;


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
	
	public DomainException(Enum message) {
		this(message, "");
	}
	
	public DomainException(String messageInfo, Throwable t ) {
		super(messageInfo, t);
	}
	
	public DomainException(Enum message, String brokenObject) {
		super();
		this.serviceExceptionMessage = message;
		this.brokenObject=brokenObject;
	}
	
	public DomainException(Enum message, String brokenObject, List<Enum> enumResults) {
		super();
		this.serviceExceptionMessage = message;
		this.brokenObject=brokenObject;
		this.enumReasons = enumResults;
	}
	
	public DomainException(Enum message, List<Enum> enumResults) {
		this(message, "", enumResults);
	}
	
	public DomainException(List<Enum> enumResults) {
		super();
		this.enumReasons = enumResults;
	}
	
	public DomainException(Enum message, String brokenObject,Throwable t ) {
        super( t );
        this.serviceExceptionMessage= message;
        this.brokenObject=brokenObject;
    }
    
    public DomainException(Enum message, Throwable t ) {
    	this(message, "", t);
    }
    
    public DomainException( Throwable t ) {
        super( t );
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
}