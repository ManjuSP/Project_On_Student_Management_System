package net.example.sdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.example.sdp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
