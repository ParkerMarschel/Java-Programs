// Import Classes that will be used
import java.math.BigInteger;
import java.util.Random;

/**
* The RSA program has three methods that will generate keys,
* encrypt a message, and decrypt a message
* @author pgm33
*/
public class RSA {

  /**
  * 'n' and 'e' act together to form the private key
  * 'n' and 'd' act together as the private key
  */
  BigInteger n, e, d;

  /**
  * 'c' is the returned encrypted message
  * 'a' is the returned decrypted message
  */
  BigInteger c, a;

  // Create a random object
  Random rand = new Random();

  /**
  * This method is used to generate both the public and private keys
  * that will be used to later encrypt and decrypt messages.
  *
  * @param bits This is the desired number of bits for the genrated BigIntegers
  */
  public void GenerateKeys(int bits)
    {
      // Step 1: two random prime numbers 'p' and 'q' created with bit length given in the parameter
      BigInteger q = new BigInteger(bits, 100, rand);
      BigInteger p = new BigInteger(bits, 100, rand);

      // These values will be used in calculations of 'tot' and 'e'
      BigInteger one = new BigInteger("1");
      BigInteger zero = new BigInteger("0");

      // 'p' and 'q' are multiplied to get 'n'
      n = q.multiply(p);

      // Calculation for the totient
      // Needs to find lcm of one less than 'p' and 'q'
      BigInteger tot = (q.subtract(one).multiply((p.subtract(one)))).divide((q.subtract(one)).gcd((p.subtract(one))));

      // Calculation of 'e'
      // If 'e' makes all of the following in the while loop evaluate to false then it is a valid value
      while (e == null || e.compareTo(one) == -1 || e.compareTo(one) == 0 || e.compareTo(tot) == 1 || e.compareTo(tot) == 0 || tot.mod(e).equals(zero) || !e.isProbablePrime(100))
      {
        e = new BigInteger(bits, 100, rand);
      }

      // Calculation of 'd'
      d = e.modInverse(tot);
    }

    /**
    * This method is used to encrypt a message by taking in the message and
    * returning it encrypted.
    *
    * @param number This is the message converted into a BigInteger
    * @return c This is the newly encrypted BigInteger
    */
    public BigInteger Encrypt(BigInteger number)
    {
      // Checks if any of the parameters are null first
      if (n == null || e == null)
      {
        return null;
      }
      // Will Encrypt the message
      else
      {
        // Calculates c
        c = number.modPow(e, n);
      }
      // Returns encrypted message
      return c;
    }

    /**
    * This method takes in an encrypted message as a BigInteger and decrypts it.
    *
    * @param number This is the encrypted message
    * @return a This is the decrypted BigInteger
    */
    public BigInteger Decrypt(BigInteger number)
    {
      // Checks if private key values are null first
      if (n == null || d == null)
      {
        return null;
      }
      // Decrypts the BigInteger
      else
      {
        // Calculates a
        a = c.modPow(d, n);
      }
      // Returns the decrypted BigInteger
      return a;
    }
}