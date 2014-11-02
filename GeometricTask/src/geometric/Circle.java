package geometric;

//import geometric.Bar;
import java.lang.Math;

public class Circle extends Coordinate {
	private double radius;
	private double circleSquare;

	public Circle(double xCentreCircle, double yCentreCircle, double radius) {
		super(xCentreCircle, yCentreCircle);
		this.radius = radius;

	}
	public double getCircleSquare() {

		return 3.14 * Math.pow(radius, 2);
	}
	public boolean add(double newXCircle, double newYCircle,
			double newRadiusCircle, double barSquare) {

		Circle circle = new Circle(newXCircle, newYCircle, newRadiusCircle);

		if (barSquare > circle.getCircleSquare()) {
			return true;
		} else {
			return false;
		}

	}

	public double getRadius() {
		return radius;
	}

	

	public void move(double newXCentreCircle, double newYCentreCircle) {

	}
}
