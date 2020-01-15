import java.lang.StringBuilder;
/**
* The FillInQuestion program is a fill in the blank question.
* @author pgm33
*/
public class FillInQuestion extends Question
{
  // Declaring the vaiables used for the class
  private String answer;
  private String text;


  /**
     Sets the answer for this question.
     @param correctResponse the answer
  */
  public void setAnswer(String correctResponse)
  {
     answer = correctResponse;
  }

  /**
     Checks a given response for correctness.
     @param response the response to check
     @return true if the response was correct, false otherwise
     // The check response also uses methods from the StringBuilder
     // class to change the string around and add the answer.
  */
  public boolean checkAnswer(String response)
  {
    int index = answer.indexOf("_");
    int length = answer.length();
    StringBuilder new_str = new StringBuilder(answer);
    new_str.delete(index,length);
    String new_answer = new_str.toString();
    response = (new_answer + "_" + response + "_");
    return response.equals(answer);
  }


}