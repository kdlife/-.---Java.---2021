package date;

import java.io.Serializable;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class ChessClock extends Clock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	public enum Player{
		LEFT,
		RIGTH
	}
	private Instant instantStart;
	private Instant instantLeft;
	private Instant instantRight;
	private long timeLeft;
	private long timeRight;
	private Player player;
	
	public ChessClock (Player player) {
		this.player=player;
	}
	public Instant gameStart() {
		if (instantStart==null) {
			this.timeLeft=0;
			this.timeRight=0;
			this.instantStart=Instant.now();
			this.instantLeft=instantStart;
			this.instantRight=instantStart;
			return instantStart;
		}
		throw new IllegalArgumentException (
				"Game alredy start");
	}
	public Instant gameEnd() {
		if(instantStart!=null) {
			instantStart=null;
			return Instant.now();
		}
		throw new IllegalArgumentException("Game not start");
	}
	
	

	@Override
	public ZoneId getZone() {
		// TODO Auto-generated method stub
		return ZoneOffset.UTC;
	}

	@Override
	public Clock withZone(ZoneId zone) {
		throw new UnsupportedOperationException(
			"Only UTC Support");
		}
	

	@Override
	public Instant instant() {
		if(instantStart!=null) {
		if(player==Player.LEFT) {// при каждом вызове метода инстант происходит смена игока
			player=Player.RIGTH;//смена игрока
			long secondLeft=Instant.now().getEpochSecond()-instantRight.getEpochSecond();//
			instantLeft=instantLeft.plusSeconds(secondLeft-timeLeft);
			timeLeft=secondLeft;
			return instantLeft;
		} else {
			if(player==Player.RIGTH) {
				player=Player.LEFT;
				long secondRight=Instant.now().getEpochSecond()-instantLeft.getEpochSecond();
				instantRight=instantRight.plusSeconds(secondRight-timeRight);
				timeRight=secondRight;
				return instantRight;
			}
		
	}}
		throw new IllegalArgumentException("game not start");
	}
}
