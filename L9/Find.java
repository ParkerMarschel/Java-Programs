import java.io.*;
import java.util.Scanner;

public class Find {
  /*
  * class searches a couple of files for a keyword. the keyword and the
  * file names are typed into the command line.
  */
  public static void main(String[] args) throws IOException {
	/*
	* Runs the code
	*/
    // Saves the word we're searching for
    String wordSearch = args[0];
    // Declare the string that will be printed
    String returnString = "";
    // Iterate through all the files we're searching in
    for(int i = 1; i < args.length; i++) {
      // Save the name of the file we're currently searching in
      String fileName = args[i];
      // Create the file object
      File currentSearch = new File(fileName);
      // Initialize the Scanner object
      Scanner search = null;

      try {
        // Read the file object
        search = new Scanner(currentSearch);
        // condition to check if the carat is at the end of the line
        while(search.hasNext()) {
          // Save the entire line
          String line = search.nextLine();
          // Check if the line contains the word we're searching for
          if (line.contains(wordSearch)) {
            // If so, add the entire line to the return String
            returnString += fileName + ": " + line + "\n\n";
          }
        }
      }
      catch (FileNotFoundException ex) {
        // Error
        System.out.println("File does not exist");
      }
      finally {
        // close the file
        search.close();
      }
    }
    // Print the output to the user.
    System.out.println(returnString);
  }
}
