package asciiPanel;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

/*
Java-based
 */
@Configuration
public class Config {
    @Bean
    public AsciiPanel asciiPanel(){
        return new AsciiPanel();
    }
    @Bean
    public AsciiFont asciiFont(){
        return new AsciiFont("cp437_8x8.png", 8, 8);
        //if all the parameters are injected, the constructor can be non-parameter
    }

    @Bean
    public String fontFilename(){
        return "cp437_8x8.png";
    }

    @Bean
    public int width(){
        return 8;
    }

    @Bean
    public int height() {
        return 8;
    }
}
