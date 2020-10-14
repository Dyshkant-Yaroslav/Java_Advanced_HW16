package ua.lviv.desctop.Homework16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		StudentDaoImpl sdi = (StudentDaoImpl) ctx.getBean("studentDaoImpl");

		sdi.create(new Student(1, 25, "Student1"));
		sdi.create(new Student(2, 25, "Student2"));
		sdi.readAll();
		System.out.println(sdi.read(1));
		sdi.update(0, new Student(1, 99, "Student007"));
		sdi.readAll();
		sdi.delete(2);
		sdi.readAll();

	}

}
