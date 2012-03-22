import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



/**
 * TODO Put here a description of what this class does.
 *
 * @author spurrme.
 *         Created Mar 22, 2012.
 */
public class PrimFactorsTest {
	@Test
	public void testComplier(){
		assertTrue("Does this work?", true);
	}
	@Test
	public void testOne(){
		assertEquals(list(), Prime_Factors.getFactors(1));
	}
	@Test
	public void testTwo(){
		assertEquals(list(2), Prime_Factors.getFactors(2));

	}
	private ArrayList<Integer> list(int... i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (Integer n : i) {
			ret.add(n);
		}
		return ret;
	}
}
