import java.util.ArrayList;


/**
 * TODO Put here a description of what this class does.
 *
 * @author spurrme.
 *         Created Mar 22, 2012.
 */
public class Prime_Factors {

	public static ArrayList<Integer> getFactors(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int j = 2; i > 1; j++) {
			while(i%j == 0){
				ret.add(j);
				i/=j;
			}
		}
	
		return ret;
	}

	public static Object generatePrime(int i) {
		return null;
	}

}
