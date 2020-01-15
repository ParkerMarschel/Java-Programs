package rpg;

/**
 * Class is the driver for the RPG lab
 * @author Parker Marschel and Adam Schilperoort
 */
public class RPG {

    public static void main(String[] args) {
        // Creates new object called Arena
        Arena arena = new Arena();
        // 2 objects of each contestant class are added into the Arena
        arena.add(new Bezerker());
        arena.add(new Bezerker());
        arena.add(new Warrior());
        arena.add(new Warrior());
        arena.add(new WildMage());
        arena.add(new WildMage());
        // If there is no winner continue to battle
        while (arena.getWinner() == null) {
            System.out.println(arena.getDescription());
            arena.playRound();
        }
        // If there is a winner
        System.out.println();
        System.out.println(arena.getDescription());
        System.out.println("Winner: " + arena.getWinner().getDescription());
    }
}
