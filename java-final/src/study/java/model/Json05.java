package study.java.model;

import java.util.List;

import study.java.model.Json04.Rss.Item;

public class Json05 {
	private Rss rss;

	public Rss getRss() {
		return rss;
	}

	public void setRss(Rss rss) {
		this.rss = rss;
	}

	@Override
	public String toString() {
		return "Json05 [rss=" + rss + "]";
	}
	public class Rss{
		
		/*
		 * Json04와 다른 점은 item을 List로 묶었다 
		 * Json05는 04와 배열이라는점만 다르고 나머지 형식이
		 * 똑같기에 이렇게 할수가 있다.
		 */
		private List<Item> item;

		public List<Item> getItem() {
			return item;
		}

		public void setItem(List<Item> item) {
			this.item = item;
		}

		@Override
		public String toString() {
			return "Rss [item=" + item + "]";
		}
		
		public class Item{
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
			public String getPubDate() {
				return pubDate;
			}
			public void setPubDate(String pubDate) {
				this.pubDate = pubDate;
			}
			@Override
			public String toString() {
				return "Item [title=" + title + ", description=" + description + ", pubDate=" + pubDate + "]";
			}
			
			
		}
	}

}
