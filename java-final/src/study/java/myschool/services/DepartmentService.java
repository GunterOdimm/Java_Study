package study.java.myschool.services;

import java.util.List;

import study.java.myschool.model.Department;

public interface DepartmentService {
	
	public Department addDepartment(Department params)
			throws NullPointerException, Exception;
		
		public Department editDepartment(Department params)
			throws NullPointerException, Exception;
		
		public void delectDepartment(Department params)
			throws NullPointerException, Exception;
		
		public Department getDepartment(Department params)
			throws NullPointerException, Exception;
		
		public List<Department> getDepartmentList()
			throws NullPointerException, Exception;

}
