package unfinsh;

public class Square {
	private int width;
	private int height;

	public Square(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;

	}

	public int getRound() {
		return width * 2 + height * 2;
	}
}
