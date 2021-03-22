package EnumExamples;

public class EnumInitialize {
	enum Initialize {
		JAN(31), FEB(28), MARCH(31), APRIL(30);
		private int value;

		Initialize(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {

		for (Initialize day : Initialize.values()) {
			System.out.println(day + " " + day.value);
		}
	}

}
