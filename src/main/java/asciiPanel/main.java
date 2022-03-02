package asciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {
    public static void main(String[] args) {

        //Java-Based
        /*
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);
        System.out.println(asciiPanel.getAsciiFont().getFontFilename());
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        AsciiPanel MyPanel = context.getBean("MyPanel",AsciiPanel.class);
        System.out.println(MyPanel.getAsciiFont().getFontFilename());
    }
}