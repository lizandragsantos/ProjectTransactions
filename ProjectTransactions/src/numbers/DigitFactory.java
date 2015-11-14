package numbers;

public class DigitFactory {

	private Digit pool[];

	public DigitFactory() {
		this.pool = new Digit[10];
	}

	public Digit creatDigit(int code) {

		if (pool[code] == null)
			pool[code] = new Digit(code);

		return pool[code];

	}
}
