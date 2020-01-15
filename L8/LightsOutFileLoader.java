package lightsoutgame;

/**
 * import java IO API Import the Scanner class
 */
import java.io.*;
import java.util.Scanner;

/**
 * Class configures a Lights Out game based on the structure of file received
 *
 * @author Parker Marschel & Zachhary Spielberger
 */
class LightsOutFileLoader {

    /**
     * Constructor method not explicitly defined
     */
    public LightsOutFileLoader() {
    }

    /**
     * Method loops through each line and checks the characters to make sure...
     * ...they are either X's or _'s and sets the value of the board at the...
     * ...location of of each character to its matching boolean value Try and
     * Catch block are used incase the file cannot be read and throws a
     * FileNotFoundException
     *
     * @param lightsOut LightsOut object which is the board
     * @param file Text file containing the configuration of the game
     * @throws IOException Input/Output exception error for the file
     * @throws UnsupportedLightsOutFileException Special Exception class for
     * files that are not supported based on the conditions that the text file
     * must meet
     */
    public void load(LightsOut lightsOut, File file) throws IOException, UnsupportedLightsOutFileException {
        Scanner input;
        try {
            input = new Scanner(file);
            String line;
            // line = input.nextLine();
            for (int row = 0; row < lightsOut.getSize(); row++) {
                if (input.hasNextLine()) {
                    line = input.nextLine();
                    for (int column = 0; column < lightsOut.getSize(); column++) {
                        String[] elementArr = line.split("");
                        String element = elementArr[column];
                        if (element.equals("X")) {
                            lightsOut.forceLit(row, column, false);
                        } else if (element.equalsIgnoreCase("_")) {
                            lightsOut.forceLit(row, column, true);
                        } else {
                            input.close();
                            throw new UnsupportedLightsOutFileException("This file is unsupported!");
                        }
                    }
                }
            }
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The file " + file + " was not found.");
        }
    }
}
