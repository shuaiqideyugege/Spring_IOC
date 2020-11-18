import com.zy.comfig.SpringConfiguration;
import com.zy.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    @Test
    public void test(){
        //ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring-context.xml");
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
        app.close();
    }

}
