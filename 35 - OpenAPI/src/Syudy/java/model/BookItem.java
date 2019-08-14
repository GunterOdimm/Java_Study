package Syudy.java.model;


public class BookItem {
	private String[] authors = null;
	private String contents = null;
	private String datetime = null;
	private String isbn = null;
	private int price = 0;
	private String publisher = null;
	private int saleprice = 0;
	private String thumbnail = null;
	private String title = null;
	private String translators = null;
	private String url = null;
	public BookItem(String[] authors2, String contents, String datetime, String isbn, int price, String publisher,
			int saleprice, String thumbnail, String title, String translators2, String url) {
		super();
		this.authors = authors2;
		this.contents = contents;
		this.datetime = datetime;
		this.isbn = isbn;
		this.price = price;
		this.publisher = publisher;
		this.saleprice = saleprice;
		this.thumbnail = thumbnail;
		this.title = title;
		this.translators = translators2;
		this.url = url;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTranslators() {
		return translators;
	}
	public void setTranslators(String translators) {
		this.translators = translators;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "BookItem [authors=" + authors + ", contents=" + contents + ", datetime=" + datetime + ", isbn=" + isbn
				+ ", price=" + price + ", publisher=" + publisher + ", saleprice=" + saleprice + ", thumbnail="
				+ thumbnail + ", title=" + title + ", translators=" + translators + ", url=" + url + "]";
	}
	
			

}
