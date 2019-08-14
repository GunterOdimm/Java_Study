package study.java.model;

import java.util.List;

public class GradeList {
	private Grade grade;

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "GradeList [grade=" + grade + "]";
	}

	public class Grade {
		private List<Member> member;

		public List<Member> getMember() {
			return member;
		}

		public void setMember(List<Member> member) {
			this.member = member;
		}

		@Override
		public String toString() {
			return "Grade [member=" + member + "]";
		}

		public class Member {
			private String name;
			private int math;
			private int kor;
			private int eng;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getMath() {
				return math;
			}

			public void setMath(int math) {
				this.math = math;
			}

			public int getKor() {
				return kor;
			}

			public void setKor(int kor) {
				this.kor = kor;
			}

			public int getEng() {
				return eng;
			}

			public void setEng(int eng) {
				this.eng = eng;
			}

			@Override
			public String toString() {
				return "Member [name=" + name + ", math=" + math + ", kor=" + kor + ", eng=" + eng + "]";
			}

		}
	}

}
