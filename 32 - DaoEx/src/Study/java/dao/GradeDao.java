package Study.java.dao;

import java.util.List;

import Study.java.model.Grade;

//학생별 성적 리스트 구현에 대한 설계
public interface GradeDao {
	/*
	 * 데이터 파일을 읽어들인 후 , 파일안에 저장된 데이터를
	 * javabeans 객체로 변환하여 list에 담아 리턴한다.
	 */
	public List<Grade> getGradeList();
	//List<>는 통째로 관리 한다는 개념 제너릭

}
