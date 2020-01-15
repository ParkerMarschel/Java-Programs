public class InvertingAmplifier extends Amplifier {
  /*
  * Class is meant to return the gain of input 2 divided by input 
  * 1, then multiplied by -1
  */
  private double r1;
  private double r2;

  public InvertingAmplifier (double r1, double r2) {
	/*
	* Constructor that saves the parameters to be used in the 
	* return methods
	*/
    this.r1 = r1;
    this.r2 = r2;
  }

  public double getGain() {
	/*
	* Method is meant to return the gain after doing the inverting 
	* equation on the two parameters that were when the object was 
	* constructed 
	* @return The gain after doing the inversion equation 
	*/
    return -r2/r1;
  }

  public String getDescription() {
	/*
	* Method is meant to return the name of the kind of amplifier
	* this class is meant to emulate, and return the values of 
	* r1 and r2 all in a string 
	* @return Returns the information about this class in a string. 
	*/
    return "Inverting Amplifier: R1 = " + r1 + ", R2 = " + r2;
  }
}
