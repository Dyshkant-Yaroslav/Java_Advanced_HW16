package ua.lviv.desctop.Homework16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfigurator {

	@Bean(name = "studentDaoImpl")
	public StudentDaoImpl getStudentDaoImpl() {
		return new StudentDaoImpl();
	}
	
}
