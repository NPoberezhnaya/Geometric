package geometric;

public class Bar extends Coordinate {
	private double width;
	private double heigth;
	private double barSquare;

	public Bar(double x, double y, double width, double heigth) {
		super(x, y);
		this.width = width;
		this.heigth = heigth;
		this.barSquare = width * heigth;
	}

	public double getWidth() {
		return width;
	}

	public double getHeigth() {
		return heigth;
	}

	public double getSquare() {
		return barSquare;
	}

}
