package lift;

public class Lift {
	private final int numberOfFloors;//

	private final float capacity;//

	private boolean turnedOn;

	private boolean moving;

	private int currentFloor;

	public Lift(int numberOfFloors, float capacity) {
		if (numberOfFloors < 1) {
			System.out.println("Number of floor is incorrect");
		}
		if (capacity < 35) {
			System.out.println("capacity is incorrect");
		}
		this.numberOfFloors = numberOfFloors;
		this.capacity = capacity;
	}

	public float getCapacity() {
		return capacity;
	}

	public void turnOn() {
		turnedOn = true;
		System.out.println("Turn on");
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	public void setTurnedOn(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}

	public void turnOff() {
		if (!moving) {
			turnedOn = false;
			System.out.println("Stop");
		}

	}

	public void move(int newFloor) {

		if ((newFloor > 0) && (newFloor < numberOfFloors)) {
			moving = true;
			currentFloor = newFloor;
			moving = false;
		} else {
			System.out.println("floor is incorrect" + newFloor);
		}
		
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

}
