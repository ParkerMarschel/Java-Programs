import java.util.Scanner;

class MadLib {
  public static void main(String[] args){
    // This is where we initialized our variables for the MadLib
    // story with all of our questions.
    Scanner scanner = new Scanner(System.in);
    System.out.print("Type an adjective: ");
    String first_adjective = scanner.next();
    System.out.print("Type a noun: ");
    String first_noun = scanner.next();
    System.out.print("Type a name: ");
    String name = scanner.next();
    System.out.print("Type another adjective: ");
    String second_adjective = scanner.next();
    System.out.print("Type another name: ");
    String friend_name = scanner.next();
    System.out.print("Name a location: ");
    String location = scanner.next();
    System.out.print("Name a holiday: ");
    String holiday = scanner.next();
    System.out.print("Name a sport: ");
    String sport = scanner.next();
    System.out.print("Name a third adjective: ");
    String third_adjective = scanner.next();
    System.out.print("Name a restaurant: ");
    String restaurant = scanner.next();
    System.out.print("Name a type of food: ");
    String food = scanner.next();
    System.out.print("Name a fourth adjective: ");
    String fourth_adjective = scanner.next();

    // This is where we began to implement our answers to the
    // questions into our actual story.
    System.out.println("My First Mad Lib Story");
    System.out.println("======================");
    System.out.println("There once was a " + first_adjective + " " + first_noun + " by the name of " + name + ".");
    System.out.println(name + " lived in a " + second_adjective + " house.");
    System.out.println(name + " had a friend by the name of " + friend_name + ", who they lived with.");
    System.out.println(name + " and " + friend_name + " took a trip to " + location + " last " + holiday + ".");
    System.out.println("They had the best time ever until.......");
    System.out.println("While at " + location + " " + friend_name + " was playing " + sport + " and broke their arm.");
    System.out.println(name + " had to rush " + friend_name + " to the hospital.");
    System.out.println(friend_name + "'s arm was fixed by a " + third_adjective + " doctor.");
    System.out.println("After, they went to " + restaurant + " to eat " + food + ".");
    System.out.println("After this " + fourth_adjective + " trip they both learned to be more careful.");

  }
}