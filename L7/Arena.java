package rpg;
import java.util.ArrayList;
import java.util.Random;
/**
 * Class runs the battle between all of the contestants in the Arena
 * @author Parker Marschel & Adam S
 */
class Arena {
    // Private instance variable
    private Contestant victor;
    // ArrayList contestants will store all of the contestants in the Arena
    ArrayList<Contestant> contestants = new ArrayList<Contestant>();
    /**
     * Constructor does nothing
     */
    public Arena() {
    }
    /**
     * Method adds Contestant objects to the contestants ArrayList
     * @param contestant Contestant object to be added to the ArrayList
     */
    public void add(Contestant contestant) {
        contestants.add(contestant);
    }
    /**
     * Method loops throughout the contestants ArrayList and calls the act method
     * on each object to run the battle if the contestant chosen is alive
     */
    public void playRound() {
        for (Contestant c: contestants){
            if (c.isAlive()){
                c.act(contestants);
                checkVictor();
            }
        }
    }
    /**
     * Method loops through all of the objects in the Arena and gets their
     * description
     * @return Returns a String containing the description of each Contestant
     */
    public String getDescription() {
        String message = "In the areana...";
        for (Contestant c: contestants){
            message += "\n";
            message += c.getDescription();
        }
        if (victor == null){
            return "\n" + message + "\n";
        }
        else{
            return message + "\n";
        }
    }
    /**
     * @return Returns a Contestant object that is the winner of the game
     */
    public Contestant getWinner() {
        return victor;
    }

    /**
     * Method checks if there is a single contestant left or if all the contestants
     * are dead.
     * Sets the last one standing or the randomly chosen Contestant to the instance variable victor
     */
    private void checkVictor() {
        // Stores the number of alive Contestants in the Arena
        int alive = 0;
        // Stores the winner
        Contestant winner = null;
        // Loops through the contestants ArrayList
        for (Contestant c: contestants){
            // If the object is alive then add 1 to the variable alive and store the object in winner
            if (c.isAlive()){
                alive += 1;
                winner = c;
            }
        }
        // If there is a single Contestant remaining
        if (alive == 1){
            // Set the contestant as the winner
            victor = winner;
        }
        // If there is no one left alive
        else if (alive == 0){
            // Chooses a random contestant in the Arena as the winner
            Random index = new Random();
            victor  = contestants.get(index.nextInt(contestants.size()));
        }
    }
}