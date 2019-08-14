package Syudy.java.model;

public class ImageItem {
	private String collection = null;
	private String dateTime = null;
	private String display_sitename = null;
	private String doc_url = null;
	private int height = 0;
	private String image_url = null;
	private String thumbnail_url = null;
	private int width = 0;
	public ImageItem(String collection, String dateTime, String displaysitename, String doc_url, int height,
			String image_url, String thumbnail_url, int width) {
		super();
		this.collection = collection;
		this.dateTime = dateTime;
		this.display_sitename = displaysitename;
		this.doc_url = doc_url;
		this.height = height;
		this.image_url = image_url;
		this.thumbnail_url = thumbnail_url;
		this.width = width;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getDisplaysitename() {
		return display_sitename;
	}
	public void setDisplaysitename(String displaysitename) {
		this.display_sitename = displaysitename;
	}
	public String getDoc_url() {
		return doc_url;
	}
	public void setDoc_url(String doc_url) {
		this.doc_url = doc_url;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getThumbnail_url() {
		return thumbnail_url;
	}
	public void setThumbnail_url(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "ImageItem [collection=" + collection + ", dateTime=" + dateTime + ", displaysitename=" + display_sitename
				+ ", doc_url=" + doc_url + ", height=" + height + ", image_url=" + image_url + ", thumbnail_url="
				+ thumbnail_url + ", width=" + width + "]";
	}

	
}
