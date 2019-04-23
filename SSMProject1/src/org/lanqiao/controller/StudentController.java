package org.lanqiao.controller;

import java.util.Map;

import org.lanqiao.entity.Student;
import org.lanqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("controller")
@Controller//StudentController加入容器
public class StudentController {
    //控制器依赖与Service
	@Autowired
	@Qualifier("studentService") 
    private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
     
	@RequestMapping("queryStudentByNo/{stuno}")
	public String queryStudentByNo(@PathVariable("stuno") Integer stuNo, Map<String,Object> map) {
		Student student=studentService.queryStudentByStuno(stuNo);
		map.put("student",student );
		return "result";
		
	}
	
	@RequestMapping("addStudent")
	public String addStudent(Student student) {
		studentService.addStudent(student);
		return "result";
		
	}
	
	@RequestMapping("deleteStudentByNo/{stuno}")
	public String deleteStudentByNo(@PathVariable("stuno") Integer stuNo) {
		studentService.deleteStudentByStuNo(stuNo);
		return "result1";
		
		
	}
	
	
	
	
	
}
