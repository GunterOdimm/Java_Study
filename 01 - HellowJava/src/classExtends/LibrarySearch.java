package classExtends;
public class LibrarySearch {
	public static void main(String[] args) {
		FileArticle FileArticle1 = new FileArticle();
		FileArticle1.setNum(1);
		FileArticle1.setTitle("첫번째 자료입니다");
		FileArticle1.setFileName("자바.ppt");
		System.out.println(FileArticle1.toString());
	
		System.out.println("----------------------------------");
		
		QNAArticle QNA = new QNAArticle();
		QNA.setNum(1);
		QNA.setTitle("첫 번째 질문입니다");
		QNA.setAnswer("첫 번째 답변입니다");
		System.out.println(QNA.toString());
	}


}
