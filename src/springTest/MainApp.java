package springTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      context.start();
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      context.stop();
      CustomEventPublisher cep = (CustomEventPublisher) context.getBean("customEventPublisher");
      
      cep.publish();
      cep.publish();
 
      
   }
}
/**
 *Business logic (domain logic) 
 *Part of program the encodes the real world business rules that determine how
 *date can be created, stored and changed. It prescribes how business objects 
 *interact with one another and enforces the routes and the methods by which 
 *business objects are accessed and updated. 
 */
/**
 * Aspect Oriented Programming
 * Breaking down program logic into distinct parts called concerns
 * The unit of modularity in the aspect. AOP helps you decouple cross cutting concerns
 * from the objects that they affect. 
 * 
 * Cross cutting concerns - functions that span multiple points of an application
 * Aspect - Module with a set of APIs providing cross cutting requirements
 * Joint point - The point in your app where you can plug in the AOP aspect.
 * Advice - the action the be taken before or after the method execution
 * Pointcut - A set of one or more join points where an advice should be executed
 * Introduction - allows you to add new methods or attributes to the existing 
 * classes
 * Target object - The object being advised by one or more aspects. This object will always 
 * be a proxied/adviced object
 * Weaving is the process of linking aspects with other application types or objects to 
 * create an advised object. 
 */
