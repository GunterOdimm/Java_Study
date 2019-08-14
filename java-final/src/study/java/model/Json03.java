package study.java.model;

import java.util.List;

public class Json03 {
	private List<String> item;

	public List<String> getItem() {
		return item;
	}

	public void setItem(List<String> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Json03 [item=" + item + "]";
	}
	
}
