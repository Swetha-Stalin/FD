package mypackage;

import java.util.Scanner;

public class mainmethod {

	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		int ch;
		do {
			myclass.displaymenu();

			/* getting input from user */

			System.out.println("\t Enter your choice");
			ch = Integer.parseInt(obj.nextLine());
			/* continous input from the user */

			switch (ch) {
			/* Getting the file after the condition is satisfied */
			case 1:
				myclass.getAllFiles();
				break;
			case 2:
				myclass.createFiles();
				break;
			case 3:
				myclass.DeleteAFile();
				break;
			case 4:
				myclass.SearchAFile();
				break;
			case 5:
				myclass.ExitFromApplication();
			}
		} while (ch > 0);
	}
}
