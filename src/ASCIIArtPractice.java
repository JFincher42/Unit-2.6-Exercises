
public class ASCIIArtPractice {

	public static void main(String[] args) {
		for (int row=0; row<8; row++) {

			// Left-hand star shape
			for(int i=0; i<row; i++) {
				System.out.print("*");
			}
			
			// Strip of space in the middle
			System.out.print(" ");
			
			// Right-hand star shape
			for (int i=0; i<-row+8; i++) {
				System.out.print("*");
			}
			
			// New row, newline
			System.out.println();
		}
	}
}