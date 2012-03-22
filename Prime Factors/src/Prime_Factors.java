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
		while(i%2 == 0){
			ret.add(2);
			i/=2;
		}
		if(i > 1){
			ret.add(i);
		}
		return ret;
	}

}
