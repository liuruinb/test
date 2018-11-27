package lige.lige;

import lige.lige.Model.Car;
import lige.lige.Model.MailSend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;

@SpringBootApplication
public class LigeApplication {

	public static void main(String[] args) throws Exception
	{
		MailSend mailSend = new MailSend();
		mailSend.sendMail("aaa@bbb.com");

//		Car car = new Car();
//		car.setBrand("红旗CA72");
//		car.setColor("红色");
//		ClassLoader loader = Thread.currentThread().getContextClassLoader();
//		System.out.println(loader);
//		System.out.println(loader.getParent());
//		System.out.println(loader.getParent().getParent());
//		Class clazz = loader.loadClass("lige.lige.Model");
//		Constructor constructor = clazz.getDeclaredConstructor((Class[])null);
//		Car car1 = (Car)constructor.newInstance();
//		SpringApplication.run(LigeApplication.class, args);
	}
}
