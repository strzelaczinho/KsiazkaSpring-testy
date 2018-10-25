package soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
	
	CDPlayer player = ctx.getBean(CDPlayer.class);
	player.play();
	MediaPlayer player2 = ctx.getBean(MediaPlayer.class);
	player2.play();
	
	ctx.close();
}
}
