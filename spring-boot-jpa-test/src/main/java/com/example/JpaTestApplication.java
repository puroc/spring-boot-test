package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.entity.Course;
import com.example.entity.Student;
import com.example.repository.CourseRepository;
import com.example.repository.StudentRepository;

@SpringBootApplication
public class JpaTestApplication {

	public static void main(String[] args) {
		// System.setProperty("spring.config.location",
		// "/Users/pud/Desktop/test.properties");
		SpringApplication.run(JpaTestApplication.class, args);
		try {
			Thread.sleep(99999999);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Bean
	public CommandLineRunner demo(CourseRepository cr, StudentRepository sr) {
		return (args) -> {
			Course course = new Course();
			course.setName("线性代数");
			course.setDescription("必修课程");
			cr.save(course);
			cr.findByName("线性代数");

			Student student = new Student();
			student.setName("张三");
			student.setSex(0);
			student.setAge(35);
			student.setCourseBean(cr.findByName("线性代数"));
			sr.save(student);
		};
	}
}
