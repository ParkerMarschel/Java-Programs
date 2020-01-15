public class Amplifier{
  /*
  * Class acts as the parent class for the other three classes, so 
  * they can all be put into an array. 
  */
  // Fields represent the two input numbers for the methods
  private double r1;
  private double r2;

  
  public double getGain() {
	/*
	* A method that is meant to be overwritten in each of the subclasses,
	* each subclass having a different equation for the returned Gain. 
	*/
    return 0;
  }

  public String getDescription() {
	/*
	* This method is meant to be overwritten in each subclass, as each 
	* subclass has a different description unique to it. 
	*/
    return "";
  }
}
