package rpg;
import java.util.Random;
import java.util.ArrayList;
public class Bezerker extends Contestant{
    Random rando = new Random();
    private int hp;
    public Bezerker(){
        super(35);
        hp = 35;
    }
    /**
     * The method attacks a randomly chosen opponent and checks if it is an instance
     * of the Warrior class because Warrior objects have a 25% of dodging smashing attacks
     * @param targets ArrayList containing Contestant objects
     */
    public void act(ArrayList<Contestant> targets){
        // Checks to make sure the contestant is alive before functioning
        if (isAlive()){
            // Chooses a random Contestant object from the targets ArrayList
            int randCont = rando.nextInt(targets.size());
            Contestant target = targets.get(randCont);
            // If the random Contestant is not alive it chooses a different random Contestant
            while (!(target.isAlive())){
                target = targets.get(rando.nextInt(targets.size()));
            }
            // If the chosen target is an instance of the class
            if (target instanceof Warrior){
                // Has 25% chance to dodge its attacks
                Random rando = new Random();
                /*
                Generates a random number out of 4 numbers (0, 1, 2, 3) and
                if the random number is the same as the dodge number then the
                Warrior dodges the attack
                */
                if (rando.nextInt(4) == 0){
                    System.out.println(target.getDescription() + " dodged the smashing attack");
                }
                // If the warrior doesn't dodge then it is a normal hit
                else{
                    target.takeDamage(20, "smashing", this);
                }

            }
            // If the target object chosen is not an instance of the Warrior class
            else{
                target.takeDamage(20, "smashing", this);
            }
        }
    }
    /**
     * Method subtracts the an integer from the hp instance variable based on the
     * type of damage being taken
     * @param points integer number to be subtracted from hp
     * @param type The type of damage as a String (fire, slashing, smashing)
     * @param character Contestant object inflicting the damage
     */
    public void takeDamage(int points, String type, Contestant character){
        int actPoints = 0;
        // If the type of damage is fire Beserker object takes half the points
            if (type.equalsIgnoreCase("fire")){
                actPoints += points / 2;
                System.out.println(getDescription() + " takes " +actPoints + " " + type +
                    " damage from " + character.getDescription());
                hp -= actPoints;
                actPoints = 0;
            }
            // If the type of damage is slashing Beserker object takes double the points
            else if(type.equalsIgnoreCase("slashing")){
                actPoints = points * 2;
                System.out.println(getDescription() + " takes " +actPoints + " " + type +
                    " damage from " + character.getDescription());
                hp -= actPoints;
                actPoints = 0;
            }
            // For smashing damage
            else{
                // System.out.println("regular damage to beserker");
                System.out.println(getDescription() + " takes " + points + " " + type +
                    " damage from " + character.getDescription());
                hp -= points;
            }
    }
    /**
     * Method describes the class
     * @return A string description of the class if dead or alive
     */
    public String getDescription(){
        if (isAlive()){
        return "A raging Beserker (" + hp + ")";
        }
        return "A slain Beserker";
    }
    /**
     * @return Returns an int hp
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
