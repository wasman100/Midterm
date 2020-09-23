import stanford.karel.SuperKarel;


public class Karel extends SuperKarel{
	public void run() {
		sizeOfBox();
	}

	private void sizeOfBox() {
		// TODO Auto-generated method stub
		int countRows = 0;
		int countCol = 0;
		while(frontIsClear()) {
			countRows++;
			move();
		}
		while(notFacingNorth()) {
			turnLeft();
		}
		while(frontIsClear()) {
			countCol++;
			move();
		}
		StartPlaceingBeepers( countRows,  countCol);

	}

	private void StartPlaceingBeepers(int countRows, int countCol) {
		// TODO Auto-generated method stub
		while(notFacingWest()) {
			turnLeft();
		}
		move();
		turnLeft();
		move();
		putBeeper();
		while(notFacingWest()) {
			turnLeft();
		}
		for(int l = 0; l < 2; l++) {
		for(int i = 0; i<(countRows-2); i++) {
			move();
			putBeeper();
		}

			turnLeft();

		for(int x =0; x < (countCol-2); x++) {
			move();
			if(noBeepersPresent()) {
				putBeeper();
			}

		}
		turnLeft();
		}
	}
}
