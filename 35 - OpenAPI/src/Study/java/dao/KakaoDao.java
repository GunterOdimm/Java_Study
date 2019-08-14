package Study.java.dao;

import java.util.List;

import Syudy.java.model.BlogItem;
import Syudy.java.model.BookItem;
import Syudy.java.model.ImageItem;
import Syudy.java.model.WebItem;

public interface KakaoDao {
	
	public List<ImageItem> getImageSerchList(String keyword);

	public List<WebItem> getWebSearchList(String keyword);
	
	public List<BlogItem> getBlogSearchList(String keyword);
	
	public List<BookItem> getBookSearchList(String keyword);

}
