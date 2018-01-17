
public class Exercise1 {

	public static void main(String[] args) {
		//fiveByFive();
		System.out.println();
		//oneByFive();
		System.out.println();
		oneByFiveInverted();
	}

	public static void fiveByFive() {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=6; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void oneByFive() {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void oneByFiveInverted() {
		for (int i=5; i>=1; i--) {
			for (int j=5; j>=i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
