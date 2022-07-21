package net.example.sdp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.example.sdp.entity.Student;
import net.example.sdp.repository.StudentRepository;

@SpringBootApplication
public class StudentDataManager1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentDataManager1Application.class, args);
	}
	

	@SuppressWarnings("unused")
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student s2= new Student("manju", "pujar", "manju@gmail.com");
		 * studentRepository.save(s2);
		 */
		
		
		
	}

}
