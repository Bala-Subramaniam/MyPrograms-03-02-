package trainingPackage;
import java.util.*;
public class shortToByte {

	public static void main(String[] args) {
		/*short shortNumber = 150;
		byte byteNumber =(byte) shortNumber;
		System.out.println(bytenumber); *.
		
		/*In this case we are trying to store high value on a lower capacity storage
		 * of int (-128 to 128)...so we can type cast on byteNumber to solve this issue
		 */
		
		short shortNumber = 100;
		byte byteNumber = (byte) shortNumber;
		System.out.println(byteNumber);   /*all value of shortnumber is in range of
										    byte dtype it can type convrt and store it
										    in byteNumber.
	}

}
