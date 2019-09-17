package crux8june2018;

public class pattern {

	public static void main(String[] args) {

		int n = 4;
		int row = 1, nst = 1, nsp = n-1;

		while (row <= n) {
			// no of spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;

			}
			// no of stars
			int cst = 1;
			while (cst <= nst) {
				if(cst%2==0)
				{
					System.out.print(" ");
				}
				else {
				
				System.out.print("*");
				
			}
				cst = cst + 1;
			}

			// prep
			System.out.println();
			row++;
			nst += 2;
			nsp=nsp-1;
		}

	}
}
