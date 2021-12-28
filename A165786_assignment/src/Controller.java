
public class Controller {
	private DiceGame diceGame = new DiceGame();
	public void rungame() {
		diceGame.play();
		new Screen2(this);
	}

	public int getgame1() {
		 return diceGame.getDie1().getFaceValue();
	}

	public int getgame2() {
		return diceGame.getDie2().getFaceValue();
	}
	
	public String getresult1() {
		return diceGame.getResult();
	}
}
