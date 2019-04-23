package org.lanqiao.service;

import org.lanqiao.entity.Student;

public interface StudentService {

	Student queryStudentByStuno(int stuNo);

	void addStudent(Student student);

	void deleteStudentByStuNo(int stuNo);

}
