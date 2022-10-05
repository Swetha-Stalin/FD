package mypackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class myclass {
	static final String projectFilesPath = "C:\\Users\\Swetha.S\\eclipse-workspace\\Test project -1\\src\\mypackage";

	public static void displaymenu() {
		System.out.println("***************************");
		System.out.println("Welcome to Lockedme");
		System.out.println("Developed by : Swetha");
		System.out.println("***************************");
		System.out.println("\t 1.Display all files");
		System.out.println("\t 2.Add a new file");
		System.out.println("\t 3.Delete a file");
		System.out.println("\t 4.Search for a file");
		System.out.println("\t 5.Exit from Application");
	}

	public static void getAllFiles() {
		File folder = new File(projectFilesPath);
		File[] listofFiles = folder.listFiles();
		/* check if the folder is empty or not */
		if (listofFiles.length > 0)
		/* if yes then display the files */
		{
			System.out.println("Files are displayed below:\n");
			/* Display the name of files present in the folder */
			for (var l : listofFiles) {
				System.out.println(l.getName());
			}
		}
		else {
			System.out.println("The folder is empty");
		}
	}

	/* to add files in the specified path */
	public static void createFiles() {
		try {
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter the filename: ");
			fileName = obj.nextLine();
			int linesCount;
			System.out.println("Enter the number of lines in the file: ");
			linesCount = Integer.parseInt(obj.nextLine());

			/* to add entries within file */
			FileWriter fw = new FileWriter(projectFilesPath + "\\" + fileName);

			for (int i = 1; i <= linesCount; i++) {
				System.out.println("Enter file line " + i);
				fw.write(obj.nextLine() + "\n");
			}
			System.out.println("Your File is created successfully");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* to delete a file */
	public static void DeleteAFile() {
		Scanner obj = new Scanner(System.in);
		String filename;
		System.out.println("Enter the filename");
		filename = obj.nextLine();
		File f = new File(projectFilesPath + "\\" + filename);
		if (f.exists()) {
			f.delete();
			System.out.println("Deletion successful");
		} else {
			System.out.println("File does'nt exists");
		}
	}

	/* Search for a file */
	public static void SearchAFile() {
		Scanner obj = new Scanner(System.in);
		String filename;
		System.out.println("Enter the file name:");
		filename = obj.nextLine();
		File f = new File(projectFilesPath + "\\" + filename);
		if (f.exists()) {
			System.out.println("The file exists:" + filename);
		} else {
			System.out.println("The file does'nt exist");
		}
	}
	
	/* To exit from the application */
	public static void ExitFromApplication() {
		System.out.println("Successful:exit from application");
		System.exit(0);

	}
}
