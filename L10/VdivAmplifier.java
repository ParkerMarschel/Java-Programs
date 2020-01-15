public class VdivAmplifier extends Amplifier {
  /*
  * Class is meant to represent a voltage-divider amplifier, which 
  * takes in two numbers, and performs an equation, which returns the 
  * gain of the equation. I know nothing about electrical engineering. 
  */
  private double r1;
  private double r2;

  public VdivAmplifier (double r1, double r2) {
	/*
	* When an object is created from this class, the object saves the two 
	* parameters, which will be used in the getGain method. 
	*/
    this.r1 = r1;
    this.r2 = r2;
  }

  public double getGain() {
	/*
	* Does the gain equation with the two input variables, and returns 
	* the gain. 
	* @return the gain of the equation 
	*/
    return r2/(r1+r2);
  }

  public String getDescription() {
	/*
	* Returns a description of the class, and what its inputs are. 
	* @return A description of the class, and what its inputs are. 
	*/
    return "Voltage Divider and Voltage Follower: R1 = " + r1 + ", R2 = " + r2;
  }
}
