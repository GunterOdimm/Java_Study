package Study.java.bbs;

public class Article {
	private int num;		//글 번호
	private String title;	//글 제목
	private String regDate;	//작성 일시

	private static int count = 0;
	private static String category;
	
	public Article(int num, String title, String regDate) {
							// 맴버변수를 초기화 하기 위한 생성자를 추가
		super();
		this.num = num;
		this.title = title;
		this.regDate = regDate;
		
		count++;			// 위과정이 한번씩 실행되었다면 카운트를 하나씩 늘린다.
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Article.count = count;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		Article.category = category;
	}

	@Override
	public String toString() {
		return "글 분류 = " + category + ", 전체 글 수 = "+ count +
				" Article [num=" + num + ", title=" + title + ", regDate=" + regDate + "]";
	}
	

}
