package study.java.myschool.service;

import java.util.List;

import study.java.myschool.model.Department;

public interface DepartmentSercive {
	
	/*
	 * 학과 정보를 새로 저장하고 저장된 정보를 조회하여 리턴한다.
	 * 저장된 행의 수가 0이거나, SQL에 에러가 있는 경우는
	 * 예외를 발생시켜서, 이 메서드를 호출하는 위치에서 try ~ catch
	 * 구문을 강제적으로 사용하도록 throws를 명시한다.
	 */
	
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
