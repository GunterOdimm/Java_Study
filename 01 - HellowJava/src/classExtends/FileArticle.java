package classExtends;

public class FileArticle extends Article {

	private String FileName;

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	public String toString() {
		return "자료실 [번호 =" + getNum() + ",제목 = " + getTitle() + ", 첨부파일 =" + FileName + "]";
	}

}
