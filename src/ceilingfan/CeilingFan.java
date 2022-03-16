package ceilingfan;

public class CeilingFan implements Ceiling {

	private static final int OFF = 0;
	private static final int MAX = 3;
	private static final int MAX_REVERSED = -3;
	
	private int speed;
	private boolean reversed;
	
	public CeilingFan() {
		this.speed = OFF;
	}

	@Override
	public int getCurrentSpeed() {
		return this.speed;
	}

	@Override
	public void increaseSpeed() {
		if (this.speed == MAX || this.speed == MAX_REVERSED) {
			this.speed = OFF;
		} else {
			if (this.reversed) {
				this.speed--;
			} else {
				this.speed++;
			}
		}
	}

	@Override
	public void reverse() {
		this.speed = this.speed * (-1);
		this.reversed = !this.reversed;
	}

}
