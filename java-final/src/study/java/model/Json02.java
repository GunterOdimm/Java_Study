package study.java.model;

public class Json02 {
	private String title;
	private String description;
	private String pubDate;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPuDate() {
		return pubDate;
	}
	public void setPuDate(String puDate) {
		this.pubDate = puDate;
	}
	@Override
	public String toString() {
		return "Json02 [title=" + title + ", description=" + description + ", pubDate=" + pubDate + "]";
	}

}
