import java.io.*;
import java.util.Scanner;

public class NameSplitter {
  /*
  * Class reads from the babynames.txt file, and creates two files,
  * boysnames.txt and girlsnames.txt from the babynames.txt file.
  */
  public static void main(String[] args) throws IOException {
	/*
	* Runs the code
	*/
	// Initializes the names of the files that will be read 
    File babynames = new File("babynames.txt");
    File boysnames = new File("boysnames.txt");
    File girlsnames = new File("girlnames.txt");
	// Initialize the scanner object to null for the try block
    Scanner input = null;
	// Create objects, so we can write to the files, boysnames.txt, and girlsnames.txt 
    PrintWriter boyFile = new PrintWriter(boysnames);
    PrintWriter girlFile = new PrintWriter(girlsnames);
	// Try block so we can read from the babynames.txt file  
    try {
	  // Read from the babynames.txt file 
      input = new Scanner(babynames);
	  // Keep reading the file until the end of it 
      while(input.hasNext()) {
        // Gets the line number out of the way
        int garbage = input.nextInt();
        // Saves the boys name, number, and percentage
        String boy = input.next() + " " + input.next() + " " + input.next();
        // Saves the girl's name, number, and percentage
        String girl = input.next() + " " + input.next() + " " + input.next();
        // Write to the boysnames.txt file
        boyFile.println(boy);
		// Write to the girlsnames.txt file 
        girlFile.println(girl);
      }
    }
    catch (FileNotFoundException ex){
      // error
    }
    finally {
	  // close all the fles
      boyFile.close();
      girlFile.close();
      input.close();
    }
  }
}
