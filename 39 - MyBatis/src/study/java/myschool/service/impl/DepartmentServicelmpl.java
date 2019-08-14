package study.java.myschool.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import study.java.myschool.model.Department;
import study.java.myschool.model.Professor;
import study.java.myschool.model.Student;
import study.java.myschool.service.DepartmentSercive;

public class DepartmentServicelmpl implements DepartmentSercive {
	
	//MyBatis의 Mapper를 호출하기 위한 SqlSession객체
	private SqlSession session;
	
	//생성자. SqlSession 을 전달받는다.
	public DepartmentServicelmpl(SqlSession session) {
		this.session = session;
	}

	//학과를 저장하기 --> 저장 후 저장된 결과를 조회하여 리턴한다.
	@Override
	public Department addDepartment(Department params) throws NullPointerException, Exception {
		
		int row_count = session.insert("DepartmentMapper.add_department", params);
		
		//저장된 데이터의 행 수가 없을 경우 강제로 예외를 발생시킨다.
		if(row_count == 0) {
			throw new NullPointerException();	//이 메서드를 호출하는곳에서 예외 발생이 인식된다.
		}
		
		return session.selectOne("DepartmentMapper.get_department_item", params);
		
		
	}

	@Override
	public Department editDepartment(Department params) throws NullPointerException, Exception {
		int row_count = session.update("DepartmentMapper.edit_department", params);
		
		//수저오딘 데이터의 행 수가 없을 경우 강제로 예외를 발생시킨다.
		if(row_count == 0) {
			throw new NullPointerException();
		}
		return session.selectOne("DepartmentMapper.get_department_item", params);
	}

	//delete 시키면 return 의 값이 null값이 되어 버리니까 반드시 void값으로 변경을 해줘야한다.
	public void delectDepartment(Department params) throws NullPointerException, Exception {
		// 1) 학생 데이터 삭제
		Student stud = new Student();
		stud.setDeptno(params.getDeptno());
		session.delete("StudentMapper.remove_student", stud);
		
		// 2) 교수 데이터 삭제
		
		Professor prof = new Professor();
		prof.setDeptno(params.getDeptno());
		session.delete("ProfessorMapper.remove_professor", prof);
		
		// 3) 학과 데이터 삭제
		int row_count = session.delete("DepartmentMapper.remove_department", params);
		
		// 최종적으로 삭제된 행이 없을 경우 강제로 예외를 발생시킨다.
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
