package study.java.myschool.services;

import java.util.List;

import study.java.myschool.model.Student;

public interface StudentService {
	
	public Student addStudent(Student params)
			throws NullPointerException, Exception;
		
		public Student editStudent(Student params)
			throws NullPointerException, Exception;
		
		public static void delectStudent(Student params)
			throws NullPointerException, Exception {
			// TODO Auto-generated method stub
			
		}
		
		public Student getStudent(Student params)
			throws NullPointerException, Exception;
		
		public List<Student> getStudentList()
			throws NullPointerException, Exception;

}
