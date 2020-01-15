
package rpg;
/**
 * Import ArrayList and Random classes
 */
import java.util.Random;
import java.util.ArrayList;
/**
 * Class inherits from Contestant class
 * @author Parker Marschel and Adam S
 */
public class Warrior extends Contestant{
    // Instance variables hp and an ArrayList containing Contestant objects
    private int hp;
    ArrayList<Contestant> nonWarrior = new ArrayList<Contestant>();
    /**
     * Constructor initializes hp as an int between 20 & 40
     * Calls parent constructor as well
     */
    public Warrior(){
        super(new Random().nextInt(21) + 20);
        hp = (new Random().nextInt(21) + 20);
    }
    /**
     * Method loops through the ArrayList in the parameter and checks which
     * objects are not the object being used and then adds them to the nonWarrior
     * ArrayList. Conditional statements check the size of the nonWarrior ArrayList
     * and which object in it has the greatest hp. The object with the greatest hp calls
     * its takeDamage method. If the object is an instance of the class it takes damage
     * differently depending on the type of damage being dealt (fire, smashing, or slashing)
     * @param targets ArrayList of Contestant objects
     */
    public void act(ArrayList<Contestant> targets){
        ArrayList<Contestant> nonWarrior = new ArrayList<Contestant>();
        nonWarrior.clear();
        for (int index = 0; index < targets.size(); index++){
            if (targets.get(index).isAlive()){
                if (!(targets.get(index).equals(this))){
                    nonWarrior.add(targets.get(index));
                }
            }
        }
        // If the nonWarrior ArrayList is less than 0 there are no objects to attack
        if (nonWarrior.size() > 0){
            /*
            Sets the first index of the ArrayList nonWarrior to the variable as
            a reference point for the for loop to check the hp of all the contestants
            in the ArrayList
            */
            Contestant mostThreat = nonWarrior.get(0);
            // Loops through the ArrayList and find the object with the greatest hp
            for (int index = 1; index < nonWarrior.size(); index++){
                if (nonWarrior.get(index).getThreat() > mostThreat.getThreat()){
                    mostThreat = nonWarrior.get(index);
                    }
            }
            // If the object witht the most hp is an instance of the class
            if (mostThreat instanceof Warrior){
                Random dodge = new Random();
                // Has 25% chance of dodging
                if (dodge.nextInt(3) != 2){
                    mostThreat.takeDamage(new Random().nextInt(6) + 10, "slashing", this);
                }
                else{
                    System.out.println(mostThreat.getDescription() + "dodged slashing attack");
                }
            }
            // If the object with the most hp is not an instance of the class
            else{
                mostThreat.takeDamage(new Random().nextInt(6) + 10, "slashing", this);
            }
        }
    }
    /**
     * Method subtracts hp based on the number of points in the parameter
     * @param points Integer to be deducted from the hp instance variable
     * @param type The type of damage as a String (fire, slashing, smashing)
     * @param character The Contestant object inflicting the damage
     */
    public void takeDamage(int points, String type, Contestant character){
            System.out.println(getDescription() + " takes " + points + " " + type +
                " damage from " + character.getDescription());
            hp -= points;
        }
    /**
     * Method describes the class
     * @return A string description of the class if dead or alive
     */
    public String getDescription(){
        if (isAlive()){
            return "A disciplined Warrior (" + hp + ")";
        }
        return "A slain Warrior";
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
