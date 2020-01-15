package rpg;
import java.util.ArrayList;
/**
 * Class extends the Contestant class
 * @author Parker Marschel and Adam S
 */
public class Contestant {
    // Instance variable hp
    private int hp;
    /**
     * Constructor initializes the hp instance variable
     * @param startHp Integer number as the starting health of the object
     */
    public Contestant(int startHp){
        hp = startHp;

    }
    /**
     * Method does nothing but is needed for all three Contestant subclasses to have
     * @param targets ArrayList of the Contestants in the Arena
     */
    public void act(ArrayList<Contestant> targets){
    }
    /**
     * Method subtracts the an integer from the hp instance variable
     * Method is needed for all three Contestant subclasses to have
     * @param points integer number to be subtracted from hp
     * @param type The type of damage as a String
     * @param character Contestant object inflicting the damage
     */
    public void takeDamage(int points, String type, Contestant character){
        System.out.println(getDescription() + " takes " + points + " " + type +
                " damage from " + character.getDescription());
        hp -= points;
            }
    /**
     * Method is needed for all three Contestant subclasses
     * @return String description of the class
     */
     public String getDescription(){
         return "";
     }
     /**
      * Method checks if the object is dead or alive based on hp status
      * @return Boolean true or false depending on the number stored in hp
      */
    public boolean isAlive(){
        return (hp > 0);
        }
    /**
     * @return return an Integer hp
     */
    public int getThreat(){
        return hp;
     }
}
