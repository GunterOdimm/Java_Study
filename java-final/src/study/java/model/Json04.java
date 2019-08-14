package study.java.model;

public class Json04 {
	// getter setter귀찮으면 걍 다 퍼블릭해도 된다.
	// 근데 정석은 getter setter사용하는것
	private Rss rss;

	public Rss getRss() {
		return rss;
	}

	public void setRss(Rss rss) {
		this.rss = rss;
	}

	@Override
	public String toString() {
		return "Json04 [rss=" + rss + "]";
	}

	public class Rss {
		private Item item;

		public Item getItem() {
			return item;
		}

		public void setItem(Item item) {
			this.item = item;
		}

		@Override
		public String toString() {
			return "Rss [item=" + item + "]";
		}

		public class Item {
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
