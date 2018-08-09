package taobao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hwua.service.UserServiceImpl;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userService");
		userServiceImpl.save();
		System.out.println(userServiceImpl.getName());
	}
}
