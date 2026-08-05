package extra;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		// providing path for folder, you can provide specific path as well
		File folder = new File("Demo");

		// exist() is use to check if file exist or not
		if (folder.exists()) {
			System.out.println("Folder Exist.");
		} else {
			folder.mkdir(); // creates folder
			System.out.println("Folder Created");
		}

		// providing path for file
		File file = new File("Demo/Greeting.txt");

		if (file.exists()) {
			System.out.println("File Exist.");
		} else {
			file.createNewFile(); // creates file
			System.out.println("File Created.");
		}

		System.out.println("---------------------");

		// Writing in file
		System.out.println("Writing inside file.....");
		FileWriter fw = new FileWriter(file);
		fw.write("Hello Java");
		fw.flush();
		fw.close();

		System.out.println("---------------------");

		// reading file
		System.out.println("Reading File.....");
		FileReader fr = new FileReader(file);
		int ch = fr.read(); // read() returns ASCII value of character
		while (ch != -1) {
			System.out.print((char) ch); // narrowing to print char
			// we will use read() inside loop to get next value
			ch = fr.read();
		}
		fr.close();

		System.out.println("\n---------------------");

		// at last deleting file and folder
		System.out.println("Deleting file...");
		file.delete();
		folder.delete();

		// if you want to see file comment out both delete()
		// this file is created inside your project folder
	}
}
