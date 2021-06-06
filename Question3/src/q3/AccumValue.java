package q3;

public class AccumValue {

	private int value;

	public AccumValue(int init) {
		value = init;
	}

	public boolean calcAccum(int limit, AccumValue[] vs) {
		int[] array = new int[limit];
		if (array.length < limit)
			return false;
		buildArray(array, vs);
		int tmp = 0;
		for (int s : array)
			tmp += s;
		int old = value;
		value = tmp;
		return old != value;
	}

	protected void buildArray(int[] array, AccumValue[] vs) {
		for (int i = 0; i < array.length; ++i)
			array[i] = vs[i].getValue();
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {

		AccumValue check = new AccumValue(25);
		check.calcAccum(2, new AccumValue[] {});
		// error comes Index 0 out of bounds for length 0

	}
}
