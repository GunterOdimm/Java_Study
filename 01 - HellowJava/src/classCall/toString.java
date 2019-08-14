package classCall;

public class toString {
	public static void main(String[] args) {
		
		Book book = new Book();
		System.out.println(book.toString());
		
		book.setTitle("Javascript+jQuery+Ajax 완벽가이드");
		book.setPrice(29700);
		book.setAuthor("주영아,이광호");
		book.setPublisher("Interpress");
		book.setPubDate("2014-11-25");
		
		System.out.println("제목: " + book.getTitle());
		System.out.println("가격: " + book.getPrice());
		System.out.println("저자: " + book.getAuthor());
		System.out.println("출판사: " + book.getPublisher());
		System.out.println("출간일: " + book.getPubDate());
	}
}