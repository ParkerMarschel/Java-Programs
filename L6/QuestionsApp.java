// Import java library classes to be used
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class QuestionsApp
{
  // Declaring a boolean value to check if the answer is true.
  public static boolean a = true;

   public static void main(String[] args)
   {
     // This is where we are delacring the questions to add
     // to the ArrayList.
     NumericQuestion first = new NumericQuestion();
     first.setText("What is the value of 15 divivded by 4?");
     first.setAnswer(3.75);

     NumericQuestion second = new NumericQuestion();
     second.setText("What is the value of e to the nearest hundreth?");
     second.setAnswer(2.72);

     FillInQuestion third = new FillInQuestion();
     third.setText("The president of NAU is _______");
     third.setAnswer("The president of NAU is _Rita Cheng_");

     FillInQuestion fourth = new FillInQuestion();
     fourth.setText("The name of NAU's mascot is _______");
     fourth.setAnswer("The name of NAU's mascot is _Louie_");

     AnyCorrectChoiceQuestion fifth = new AnyCorrectChoiceQuestion();
     fifth.setText("What is one of NAU's colors?");
     fifth.addChoice("Blue", true);
     fifth.addChoice("Red", false);
     fifth.addChoice("Gold", true);
     fifth.addChoice("Pink", false);

     AnyCorrectChoiceQuestion sixth = new AnyCorrectChoiceQuestion();
     sixth.setText("Which one is a university in Arizona?");
     sixth.addChoice("NAU", true);
     sixth.addChoice("UCLA", false);
     sixth.addChoice("ASU", true);
     sixth.addChoice("USC", false);

    List<Question> Questions = new ArrayList<Question>();

     Questions.add(first);
     Questions.add(second);
     Questions.add(third);
     Questions.add(fourth);
     Questions.add(fifth);
     Questions.add(sixth);

     // This is where we run through the enhanced for loop to ask the
     // questions as well as add the total points and return it.
     int points = 0;
     for (Question q : Questions)
     {
     if (q instanceof Question)
        presentQuestion(q);
        // boolean a = presentQuestion(q);
        if (q instanceof NumericQuestion){
          if(a){
            points += 1;
            }
          }

        if (q instanceof FillInQuestion){
          if(a){
            points += 2;
            }
          }

        if (q instanceof AnyCorrectChoiceQuestion){
          if(a){
            points += 3;
            }
          }

      }
      System.out.println("Total score is: " + points + " out of 12.");
      System.out.println("Thanks for playing.");
   }


   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static void presentQuestion(Question q)
   {
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      a = q.checkAnswer(response);
      System.out.println("Your answer is " +  q.checkAnswer(response));
   }
}