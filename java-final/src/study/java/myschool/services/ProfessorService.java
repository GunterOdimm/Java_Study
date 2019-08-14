package study.java.myschool.services;

import java.util.List;

import study.java.myschool.model.Department;
import study.java.myschool.model.Professor;

public interface ProfessorService {
	
	public ProfessorService addProfessor(ProfessorService params)
			throws NullPointerException, Exception;
		
		public ProfessorService editProfessor(ProfessorService params)
			throws NullPointerException, Exception;
		
		public static  void delectProfessor(Professor dept)
			throws NullPointerException, Exception {
			// TODO Auto-generated method stub
			
		}
			
		
		
		public ProfessorService getProfessor(ProfessorService params)
			throws NullPointerException, Exception;
		
		public List<ProfessorService> getProfessorList()
			throws NullPointerException, Exception;


}
