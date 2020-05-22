package springTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Need to make a class that published the custom event. 
 * Need to declare this class in the in XML configuration 
**/

public class CustomEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		this.publisher = arg0;
		
	}

	public void publish(){
		CustomEvent ce = new CustomEvent(this);
		publisher.publishEvent(ce);
	}

	
}
