package org.lanqiao.mapper;

import org.lanqiao.entity.Student;

public interface StudentMapper {
	Student queryStudentByStuno(int stuNo);

public	void addStudent(Student student);

public	void deleteStudentByStuNo(int stuNo);

}
