package Syudy.java.model;

public class BlogItem {
	private String blogname = null;
	private String contents = null;
	private String datatime = null;
	private String thumbnail = null;
	private String title = null;
	private String url = null;
	public BlogItem(String blogname, String contents, String datatime, String thumbnail, String title, String url) {
		super();
		this.blogname = blogname;
		this.contents = contents;
		this.datatime = datatime;
		this.thumbnail = thumbnail;
		this.title = title;
		this.url = url;
	}
	public String getBlogname() {
		return blogname;
	}
	public void setBlogname(String blogname) {
		this.blogname = blogname;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDatatime() {
		return datatime;
	}
	public void setDatatime(String datatime) {
		this.datatime = datatime;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "BlogItem [blogname=" + blogname + ", contents=" + contents + ", datatime=" + datatime + ", thumbnail="
				+ thumbnail + ", title=" + title + ", url=" + url + "]";
	}
	
	

}
