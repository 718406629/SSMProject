package org.lanqiao.service.impl;

import org.lanqiao.entity.Student;
import org.lanqiao.mapper.StudentMapper;
import org.lanqiao.service.StudentService;

public class StudentServiceImpl implements StudentService {
    //StudentServiceImpl“¿¿µ”ÎstudentMapper
	private StudentMapper studentMapper;
	 
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	public Student queryStudentByStuno(int stuNo) {
	   return 	studentMapper.queryStudentByStuno(stuNo);
	}

	@Override
	public void addStudent(Student student) {
          studentMapper.addStudent(student);		
	}

	@Override
	public void deleteStudentByStuNo(int stuNo) {
      studentMapper.deleteStudentByStuNo(stuNo);		
	}

	
	
}
