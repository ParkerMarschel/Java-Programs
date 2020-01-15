/**
 * Import the ArrayList and Random classes
 */
package rpg;
import java.util.ArrayList;
import java.util.Random;
/**
 * Class inherits from the Contestant class
 * @author Parker Marschel @ Adam S
 */
public class WildMage extends Contestant{
    // Instance variable hp declared as an int and holds the health of the mage object
    private int hp;
    /**
     * Constrictor calls super constructor and gets a random number between 10 & 50
     * and initializes the hp variable with with that number
     */
    public WildMage() {
        super(new Random().nextInt(51) + 10);
        hp = (new Random().nextInt(51) + 10);
    }
    /**
     * Method loops through all the elements in the targets ArrayList
     * Calls their takeDamage method and passes in a random number between 0 & 6
     * the damage type fire as a String and itself as a Contestant object
     * @param targets ArrayList of Contestant objects
     */
    public void act(ArrayList<Contestant> targets){
        // Optional
        if (isAlive()){
            for (Contestant c: targets){
                if (c.isAlive()){
                    c.takeDamage(new Random().nextInt(7), "fire", this);
                }
            }
        }
    }
    /**
     * Method takes away integer values from the hp instance variable and if hp
     * becomes less than or equal to 0 it calls the takeDamage method on the Contestant object
     * passed into the parameter as the argument character
     * @param points number to be subtracted from the hp instance variable
     * @param type Type of damage as a string (fire, smashing, or slashing)
     * @param character Contestant object that called the takeDamage method on Mage object
     */
    public void takeDamage(int points, String type, Contestant character){
        if (!(character instanceof WildMage)){
            System.out.println(getDescription() + " takes " + points + " " + type +
                " damage from " + character.getDescription());
            hp -= points;
            if (hp <= 0){
                character.takeDamage(5, "fire", this);
            }
        }
        else{
            // If the character and the Mage object are the same
            if (this.equals(character)){
                System.out.println(getDescription() + " takes " + points + " " + type +
                " damage from " + character.getDescription());
                hp -= points;
                // If the mage kills itself it will not deal 5 fire damage back to its dead self
                if (hp <= 0){
                    System.out.println(getDescription() + " killed itself");
                }
            }
            // If the character is the other Wild Mage object
            else{
                System.out.println(getDescription() + " takes " + points + " " + type +
                " damage from " + character.getDescription());
                hp -= points;
                if (hp <= 0){
                    if (character.isAlive()){
                    character.takeDamage(5, "fire", this);
                    }
                }
            }
        }
    }
    /**
     * Method describes the class
     * @return A string description of the class if dead or alive
     */
     public String getDescription(){
        if (isAlive()){
        return "A wild Mage (" + hp + ")";
        }
        return "A dead Mage";
    }
     /**
      * @return Integer instance variable hp
      */
    public int getThreat(){
        return hp;
    }
    /**
     * Method checks if the hp is greater than 0
     * @return Returns boolean true or false depending on the state of hp
     */
    public boolean isAlive(){
    return (hp > 0);
    }
}
