package soundsystem;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
public static void main(String[] args) {
	 ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("soundsystem/PropertyValueTest-context.xml");

	
	CompactDisc comp = (CompactDisc) context.getBean("compactDisc");
	
	comp.play();
}
}
