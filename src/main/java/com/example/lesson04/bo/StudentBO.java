package com.example.lesson04.bo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.domain.Student;
import com.example.lesson04.mapper.StudentMapper;
import com.example.lesson07.entity.StudentEntity;

@Service
public class StudentBO {

	@Autowired
	private StudentMapper studentMapper;
	//  input: Student
	// output: X
	
	//  input: 파라미터 4개
	// output: StudentEntity
	public StudentEntity addStudent(String name,String phoneNumber,
			String email, String dreamjob) {
		
		StudentEntity student =  StudentEntity.builder()
				.name(name)
				.phoneNumber(phoneNumber)
				.email(email)
				.dreamJob(dreamjob)
				.createdAt(LocalDateTime.now()) // CreateTimestamp 있으면 생략 가능
				.build();
		
		
	}
	
	public void addStudent(Student student) {
		studentMapper.insertStudent(student);
	}
	
	//  input: id
	// output: Student
	public Student getStudentById(int id) {
		return studentMapper.selectStudentById(id);
	}
}
