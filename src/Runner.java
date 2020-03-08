import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Runner {
	
	//comment 2

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		File myFile = new File("safePlace.txt");
		FileWriter myWriter = null;
		try {
			 myWriter = new FileWriter(myFile);
		} catch (IOException e) {
			System.out.println("Uh Oh!");
			System.exit(0);
		}
		String name = "";
		
		System.out.println("Hello world!");
		System.out.println("What is your name?");
		name = myScanner.nextLine();
		System.out.println("Nice to meet you " + name + "!");
		System.out.println("Don't worry, I'll remember it...");
		
		try {
			myWriter.write(name);
			myWriter.close();
		} catch (IOException e) {
			System.out.println("Uh Oh!");
			System.exit(0);
		}
		

	}

}
