package lift;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LiftTest {
	private Lift lift1 ;
	
	@Before
	public void setup (){
		lift1 = new Lift(100, 50);
}
	
	@Test
	public void testMoveUpSuccess() {
	
		lift1.setCurrentFloor(1);
		lift1.move(5);
		int resMove = lift1.getCurrentFloor();
		assertEquals(resMove, 5);

	}
	
	@Test
	public void testMoveDownSuccess() {
		lift1.setCurrentFloor(60);
		lift1.move(55);
		int resMove = lift1.getCurrentFloor();
		assertEquals(resMove, 55);

	}
	
	@Test
	public void testMoveTo75Success() {
		
		
			lift1.setCurrentFloor(100);
			lift1.move(75);
			int resMove = lift1.getCurrentFloor();
	
		assertEquals(resMove, 75);

	}

	@Test
	public void testMoveDownBelowFirstFloorSuccess() {
		

		lift1.setCurrentFloor(1);
		lift1.move(0);
		int resMove = lift1.getCurrentFloor();
		assertEquals(resMove, 1);

	}
	@Test
	public void testMoveUpperLastFloorSuccess() {
		
		lift1.setCurrentFloor(100);
		lift1.move(101);
		int resMove = lift1.getCurrentFloor();
		assertEquals(resMove, 100);

	}

	@Test
	public void turnOffTestSuccessMovingIsTrue() {
		lift1.setTurnedOn(true); 
		lift1.setMoving(true);
	    lift1.turnOff();
		boolean resTurnOff = lift1.isTurnedOn();
		assertEquals(resTurnOff, true);
	}
	
	@Test
	public void turnOffTestSuccessMovingIsFalse() {
		lift1.setTurnedOn(true); 
		lift1.setMoving(false);
	    lift1.turnOff();
		boolean resTurnOff = lift1.isTurnedOn();
		assertEquals(resTurnOff, false);
	}
	
	@Test
	public void turnOnTestSuccessMovingIsFalse() {
		lift1.setTurnedOn(false); 
		lift1.setMoving(false);
	    lift1.turnOn();
		boolean resTurnOn = lift1.isTurnedOn();
		assertEquals(resTurnOn, true);
	}
	
	@Test
	public void turnOnTestSuccessMovingIsTrue() {
		lift1.setTurnedOn(false); 
		lift1.setMoving(true);
	    lift1.turnOn();
		boolean resTurnOn = lift1.isTurnedOn();
		assertEquals(resTurnOn, true);
	}
}

