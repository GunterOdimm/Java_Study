package study.java.myschool.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import study.java.myschool.model.Department;
import study.java.myschool.model.Professor;
import study.java.myschool.model.Student;
import study.java.myschool.services.ProfessorService;

public class ProfessorServiceimpl implements ProfessorService{
	
	private SqlSession session;
	
	public ProfessorServiceimpl(SqlSession session) {
		this.session = session;
	}
	

	@Override
	public ProfessorService addProfessor(ProfessorService params) throws NullPointerException, Exception {
		int row_count = session.insert("ProfessorMapper.add_professor", params);
		
		
		if(row_count == 0) {
			throw new NullPointerException();
		}
		
		return session.selectOne("ProfessorMapper.get_professor_item", params);
		
		
	}

	@Override
	public ProfessorService editProfessor(ProfessorService params) throws NullPointerException, Exception {
		int row_count = session.update("ProfessorMapper.edit_professor", params);

		if(row_count == 0) {
			throw new NullPointerException();
		}
		return session.selectOne("ProfessorMapper.get_professor_item", params);
	}

	public void delectProfessor(ProfessorService params) throws NullPointerException, Exception {

		Student stud = new Student();
		stud.setDeptno(((Student) params).getDeptno());
		session.delete("StudentMapper.remove_student", stud);
		

		Department depa = new Department();
		depa.setDeptno(((Department) params).getDeptno());
		session.delete("DepartMapper.remove_professor", depa);
	
		int row_count = session.delete("ProfessorMapper.remove_professor", params);
		

		if(row_count == 0) {
			throw new NullPointerException();
		}
	}

	@Override
	public ProfessorService getProfessor(ProfessorService params) throws NullPointerException, Exception {
		Professor item = session.selectOne("ProfessorMapper.get_professor_item", params);
		
		if(item == null) {
			throw new NullPointerException();
		}
		
		return (ProfessorService) item;
	}

	@Override
	public List<ProfessorService> getProfessorList() throws NullPointerException, Exception {
		List<ProfessorService> list = session.selectList("ProfessorMapper.get_professor_list",null);
		
		if(list == null) {
			throw new NullPointerException();
		}
		return list;
	}

}
