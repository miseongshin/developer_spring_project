package spring_step3.ems.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import spring_step3.ems.member.dao.StudentDao;

public class StudentAllSelectService {
	
	@Autowired
	private StudentDao studentDao;
	
	public StudentAllSelectService(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	public void allSelectService(){
		
	}
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	
}
