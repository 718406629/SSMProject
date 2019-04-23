package org.lanqiao.controller;

import java.util.Map;

import org.lanqiao.entity.Student;
import org.lanqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("controller")//处理请求映射
@Controller//StudentController加入容器  2、使用Controller注解可以把普通类变成控制器
public class StudentController {
    //控制器依赖与Service
	@Autowired//根据类型注入（会在IOC容器里寻找StudentService类型的bean）
	@Qualifier("studentService") //根据名字注入（会在IOC容器里寻找id为studentService的bean）
    private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
     
	@RequestMapping("queryStudentByNo/{stuno}")//这里的map可以把student返回给request域 ，
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
