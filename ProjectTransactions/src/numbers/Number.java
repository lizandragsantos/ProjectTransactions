package numbers;

import java.util.*;

public class Number {

	private List<Digit> numbers;

	public Number() {

		this.numbers = new ArrayList<>();
	}

	public List<Digit> getNumbers() {
		return numbers;
	}

	public String toString() {
		String x = "";
		for (Digit d : numbers) {
			x = x.concat(d.toString());
		}
		return x;
	}

}
