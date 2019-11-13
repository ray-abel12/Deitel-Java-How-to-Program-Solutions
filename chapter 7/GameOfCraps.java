package exercises;

import java.security.SecureRandom;

public class GameOfCraps {
	final static SecureRandom randomnumber = new SecureRandom();
	private enum Status{CONTINUE,WON,LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

public static void main(String[] args) {
	
	int mypoint = 0;
	Status gameStatus;
	int sumOfDice = rollDice();
	
switch(sumOfDice) {
case SEVEN:
case YO_LEVEN:
gameStatus = Status.WON; 
}
}	
}