package numbers;

public class Digit {

	private int code;

	Digit(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public String toString() {
		return String.valueOf(this.code);
	}
}
