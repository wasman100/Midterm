import stanford.karel.SuperKarel;

public class Karel extends SuperKarel {
	public void run() {
		move();
		turnLeft();
		move();
		while (notFacingEast()) {
			turnLeft();
		}
		StartPlaceingBeepers();
	}

	private void StartPlaceingBeepers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			while (frontIsClear()) {
				if (noBeepersPresent()) {
					putBeeper();
				}
				move();
			}
			backup();
			turnLeft();
		}
	}

	private void backup() {
		// TODO Auto-generated method stub
		turnAround();
		move();
		turnAround();
	}

}
