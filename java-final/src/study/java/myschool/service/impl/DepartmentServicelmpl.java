package study.java.myschool.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import study.java.myschool.model.Department;
import study.java.myschool.model.Professor;
import study.java.myschool.model.Student;
import study.java.myschool.services.DepartmentService;


public class DepartmentServicelmpl implements DepartmentService {
	
	private SqlSession session;

	public DepartmentServicelmpl(SqlSession session) {
		this.session = session;
	}

	@Override
	public Department addDepartment(Department params) throws NullPointerException, Exception {
		
		int row_count = session.insert("DepartmentMapper.add_department", params);
		
	
		if(row_count == 0) {
			throw new NullPointerException();
		}
		
		return session.selectOne("DepartmentMapper.get_department_item", params);
		
		
	}

	@Override
	public Department editDepartment(Department params) throws NullPointerException, Exception {
		int row_count = session.update("DepartmentMapper.edit_department", params);

		if(row_count == 0) {
			throw new NullPointerException();
		}
		return session.selectOne("DepartmentMapper.get_department_item", params);
	}

	public void delectDepartment(Department params) throws NullPointerException, Exception {

		Student stud = new Student();
		stud.setDeptno(params.getDeptno());
		session.delete("StudentMapper.remove_student", stud);
		

		
		Professor prof = new Professor();
		prof.setDeptno(params.getDeptno());
		session.delete("ProfessorMapper.remove_professor", prof);
		

		int row_count = session.delete("DepartmentMapper.remove_department", params);
		

		if(row_count == 0) {
			throw new NullPointerException();
		}
		
	}

	@Override
	public Department getDepartment(Department params) throws NullPointerException, Exception {
		Department item = session.selectOne("DepartmentMapper.get_department_item", params);
		
		if(item == null) {
			throw new NullPointerException();
		}
		
		return item;
	}

	@Override
	public List<Department> getDepartmentList() throws NullPointerException, Exception {
		List<Department> list = session.selectList("DepartmentMapper.get_department_list",null);
		
		if(list == null) {
			throw new NullPointerException();
		}
		return list;
	}

}