package springTest;
import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent arg0) {
		System.out.println(arg0.toString());
		
	}

}
