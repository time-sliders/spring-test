import com.noob.test.model.User;
import com.noob.test.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LuYun
 * @version transfer split
 * @since 2018.09.18
 */
public class Bootstrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = ctx.getBean("user", User.class);
        ctx.getBean("userService", UserService.class).addUser(user);
    }
}
