package recursion;

public class countZeroesUse {

	public static int countZerosRec(int input) {
		// Write your code here

		if (input < 10) {

			if (input % 10 == 0)
				return 1;

			return 0;

		}

		if (input % 10 == 0)
			return countZerosRec(input / 10) + 1;

		return countZerosRec(input / 10);

	}
}
