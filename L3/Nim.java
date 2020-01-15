import java.util.Scanner;
import java.util.Random;

class Nim {
  public static void main(String[] args) {
    //This is where we are declaring our variables
  Random randy = new Random();
  int pile = randy.nextInt(100) + 10;
  System.out.println("Current numbers of marbles in the pile:" + pile);
  int turn = randy.nextInt(1) + 0;
  int player_choice;
  int choice = 0;

  // 0 = Computer first, 1 = human first
    if (turn == 0){
      // Stupid = 0, smart = 1
      int mode = randy.nextInt(1) + 0;
          if (mode == 0)
          {
            while (pile >= 0)
            {
              // If there is only 1 marble left they have to pick 1.
              if (pile == 1)
              {
                System.out.println("The computer loses! There was only one marble left!");
                System.exit(0);
              }
              else
              {
                  choice = randy.nextInt(pile/2) + 1;
              }
              System.out.println("The computer removed: " + choice + " marble(s).");
              pile = pile - choice;
              // After the computer goes if there is only 1 left then the user will lose
              if (pile  == 1)
              {
                System.out.println("You lose! there was only one marble left!");
                System.exit(0);
              }
              // After the computer goes if there is 0 left then the computer will lose
              else if (pile == 0)
              {
                break;
              }
              else
              {
              System.out.println("The pile currently has : " + pile + " marble(s).");
              Scanner scanner = new Scanner(System.in);
              System.out.println("How many marbles would you like to remove: ");
              player_choice = scanner.nextInt();
                if (player_choice > (pile/2))
                {
                  while (player_choice > (pile/2))
                  {
                    System.out.println("This was an invalid choice. Please select less than half of the pile.");
                    System.out.println("How many marbles would you like to remove: ");
                    player_choice = scanner.nextInt();
                  }
                }
              pile = pile - player_choice;
              System.out.println("The pile currently has : " + pile + " marble(s).");
            }

            }

          }
          else
          {
            while (pile >= 0)
            {
              if (pile > 63)
              {
                choice = pile - 63;
              }
              else if (pile == 63)
              {
                choice = randy.nextInt(pile/2) + 1;
              }
              else if (pile > 31)
              {
                choice = pile - 31;
              }
              else if (pile == 31)
              {
                choice = randy.nextInt(pile/2) + 1;
              }
              else if (pile > 15)
              {
                choice = pile - 15;
              }
              else if (pile == 15)
              {
                choice = randy.nextInt(pile/2) + 1;
              }
              else if (pile > 7)
              {
                choice = pile - 7;
              }
              else if (pile == 7)
              {
                choice = randy.nextInt(pile/2) + 1;
              }
              else if (pile > 3)
              {
                choice = pile - 3;
              }
              else if (pile == 1)
              {
                System.out.println("The computer loses! There was only one marble left!");
                System.exit(0);
              }
              // If the pile is 0 then there is no marbles to pick
              else if (pile == 0)
              {
                break;
              }
              System.out.println("The computer removed: " + choice + " marble(s).");
              pile = pile - choice;
              // After the computer goes if there is only 1 left then the user will lose.
              if (pile == 1)
              {
                System.out.println("You lose! there was only one marble left!");
                System.exit(0);
              }
              else
              {
              System.out.println("The pile currently has : " + pile + " marble(s).");
              Scanner scanner = new Scanner(System.in);
              System.out.println("How many marbles would you like to remove: ");
              player_choice = scanner.nextInt();
                if (player_choice > (pile/2))
                {
                  while (player_choice > (pile/2))
                  {
                    System.out.println("This was an invalid choice. Please select less than half of the pile.");
                    System.out.println("How many marbles would you like to remove: ");
                    player_choice = scanner.nextInt();
                  }
                }
              pile = pile - player_choice;
              System.out.println("The pile currently has : " + pile + " marble(s).");
            }
            }

          }

    }
    else
    {
      // Stupid = 0, smart = 1
      int mode = randy.nextInt(1) + 0;
          if (mode == 0)
          {
            while (pile >= 0)
            {
              System.out.println("The pile currently has : " + pile + " marble(s).");
              Scanner scanner = new Scanner(System.in);
              System.out.println("How many marbles would you like to remove: ");
              player_choice = scanner.nextInt();
                if (player_choice > (pile/2))
                {
                  while (player_choice > (pile/2))
                  {
                    System.out.println("This was an invalid choice. Please select less than half of the pile.");
                    System.out.println("How many marbles would you like to remove: ");
                    player_choice = scanner.nextInt();
                  }
                }
              pile = pile - player_choice;
              // After the user goes if there is only 1 left then the computer will lose
              if (pile == 1)
              {
                System.out.println("The computer loses! there was only one marble left!");
                System.exit(0);
              }
              else if (pile == 0)
              {
                break;
              }
              else
              {
                  choice = randy.nextInt(pile/2) + 1;
              }
              System.out.println("The computer removed: " + choice + " marble(s).");
              pile = pile - choice;
              System.out.println("The pile currently has : " + pile + " marble(s).");

            }

          }
          else
          {
            while (pile >= 0)
            {
              System.out.println("The pile currently has : " + pile + " marble(s).");
              Scanner scanner = new Scanner(System.in);
              System.out.println("How many marbles would you like to remove: ");
              player_choice = scanner.nextInt();
                if (player_choice > (pile/2))
                {
                  while (player_choice > (pile/2))
                  {
                    System.out.println("This was an invalid choice. Please select less than half of the pile.");
                    System.out.println("How many marbles would you like to remove: ");
                    player_choice = scanner.nextInt();
                  }
                }
              pile = pile - player_choice;
              System.out.println("The pile currently has : " + pile + " marble(s).");
              // After the user goes if there is only 1 left then the computer will lose
              if (pile == 1)
              {
                System.out.println("The computer loses! there was only one marble left!");
                System.exit(0);
              }
              else if (pile == 0)
              {
                break;
              }
              else if (pile > 63)
              {
                choice = pile - 63;
              }
              else if (pile == 63)
              {
                choice = randy.nextInt(pile/2) + 1;
              }
              else if (pile > 31)
              {
                choice = pile - 31;
              }
              else if (pile == 31)
              {
                choice = randy.nextInt(pile/2) + 1;
              }
              else if (pile > 15)
              {
                choice = pile - 15;
              }
              else if (pile == 15)
              {
                choice = randy.nextInt(pile/2) + 1;
              }
              else if (pile > 7)
              {
                choice = pile - 7;
              }
              else if (pile == 7)
              {
                choice = randy.nextInt(pile/2) + 1;
              }
              else if (pile > 3)
              {
                choice = pile - 3;
              }
                System.out.println("The computer removed: " + choice + " marble(s).");
              pile = pile - choice;
              System.out.println("The pile currently has : " + pile + " marble(s).");

            }
          }
    }
  }
}