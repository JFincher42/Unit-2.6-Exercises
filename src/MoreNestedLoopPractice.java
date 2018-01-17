
public class MoreNestedLoopPractice {

	public static void main(String[] args) {
		System.out.println("\nSlashBang:");
		slashBang();
		System.out.println("\nDiamond:");
		diamond();
	}

	public static void diamond() {
		// 5 rows
		for (int row=0; row<5; row++) {
			for (int i=0; i<5-row; i++) {
				System.out.print(".");
			}
			for (int i=0; i<2*row+1; i++) {
				System.out.print("*");
			}
			for (int i=0; i<5-row; i++) {
				System.out.print(".");
			}
			System.out.println();
		}
		
		// Middle row of stars
		System.out.println("***********");
		
		// Bottom half
		for (int row=0; row<5; row++) {
			for (int i=0; i<row+1; i++) {
				System.out.print(".");
			}
			for (int i=0; i<9-2*row; i++) {
				System.out.print("*");
			}
			for (int i=0; i<row+1; i++) {
				System.out.print(".");
			}
			System.out.println();
		}
	}
	public static void slashBang() {
		int stepBSlash=2, stepSlash=2, stepBang=-4;
		int firstRowBSlash=0, firstRowSlash=0, firstRowBang=22;

		// Print six rows
		for (int row=0; row<6; row++) {
			// First character is backslash (\)
			for(int i=0; i<(stepBSlash * row) + firstRowBSlash; i++) {
				System.out.print("\\");
			}

			// Next we have the bang (!)
			for (int i=0; i<(stepBang * row) + firstRowBang; i++) {
				System.out.print("!");
			}

			// Lastly we have the forward slash (/)
			for (int i=0; i<(stepSlash * row) + firstRowSlash; i++) {
				System.out.print("/");
			}
			System.out.println();
		}
	}

}
