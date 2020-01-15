import java.util.ArrayList;

/**
* The AnyCorrectChoiceQuestion program is a question with multiple correct choices.
*
* @author pgm33
*/
public class AnyCorrectChoiceQuestion extends Question
{
  // Declaring the vaiables used for the class
   private ArrayList<String> choices;
   private ArrayList<String> answers;
   private String answer;

   /**
      Constructs an arraylist for the choices and correct answers
   */
   public AnyCorrectChoiceQuestion()
   {
      choices = new ArrayList<String>();
      answers = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct)
      {
         // Convert choices.size() to string
         String choiceString = "" + choices.size();
         setAnswer(choiceString);
      }
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
      answers.add(answer);
   }

   /**
      Displays the choices and that there can be multiple answers.
   */
   public void display()
   {
      // Display the question text
      super.display();
      // Display the answer choices
      for (int i = 0; i < choices.size(); i++)
      {
         int choiceNumber = i + 1;
         System.out.println(choiceNumber + ": " + choices.get(i));
      }
      System.out.println("Note, there may be several correct answers.");
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
     if (answers.contains(response))
      {
        return true;
      }
     else
      {
       return false;
      }
   }

}