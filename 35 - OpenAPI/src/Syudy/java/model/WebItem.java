package Syudy.java.model;

public class WebItem {
	private String title = null;
	private String datetime = null;
	private String url = null;
	private String contents = null;
	
	
	public WebItem(String title, String datetime, String url, String contents) {
		super();
		this.title = title;
		this.datetime = datetime;
		this.url = url;
		this.contents = contents;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}


	@Override
	public String toString() {
		return "WebItem [title=" + title + ", datetime=" + datetime + ", url=" + url + ", contents=" + contents + "]";
	}
	
	
	

}
