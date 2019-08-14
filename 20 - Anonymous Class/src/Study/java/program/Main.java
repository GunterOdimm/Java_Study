package Study.java.program;

import Study.java.bbs.Article;

public class Main {
	public static void main(String[] args) {
		Article.setCategory("자유게시판");

		Article a1 = new Article(1, "첫 번째 글 제목", "2019-06-03");
		Article a2 = new Article(2, "두 번째 글 제목", "2019-06-04");
		Article a3 = new Article(3, "세 번째 글 제목", "2019-06-05");

		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());

		System.out.println("--------------------------------------------------------");

		Article.setCategory("공지사항");

		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
	}

}
