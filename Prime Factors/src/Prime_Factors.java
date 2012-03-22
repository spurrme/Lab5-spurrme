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

	public static ArrayList<Integer> generatePrime(int i) {
		ArrayList<Integer> ret =  new ArrayList<Integer>();
		if(i > 2){
			ret.add(2);
			for (int j = 3; j < i; j++) {
				if(testIsPrime(j)){
					ret.add(j);
				}
			}
		}
		return ret;
	}

	private static boolean testIsPrime(int j) {
		for (int i = 2; i < j; i++) {
			if(j%i == 0){
				return false;
			}
			else{
				return true;
			}
		}
		return false;
	}

}
