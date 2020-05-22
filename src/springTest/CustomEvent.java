package springTest;

import org.springframework.context.ApplicationEvent;
//Create a custom event call need to extended ApplicationEvent class
public class CustomEvent extends ApplicationEvent {
	
	public CustomEvent(Object source){
		super(source);
	}
	
	public String toString(){
		return "My Custom Event";
	}
	
	
}
