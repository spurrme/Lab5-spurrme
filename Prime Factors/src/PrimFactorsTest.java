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
	@Test
	public void testThree(){
		assertEquals(list(3), Prime_Factors.getFactors(3));
	}
	@Test
	public void testFour(){
		assertEquals(list(2, 2), Prime_Factors.getFactors(4));
	}
	@Test
	public void testSix(){
		assertEquals(list(2, 3), Prime_Factors.getFactors(6));
	}
	@Test 
	public void testEight(){
		assertEquals(list(2, 2, 2), Prime_Factors.getFactors(8));
	}
	@Test 
	public void testNine(){
		assertEquals(list(3, 3), Prime_Factors.getFactors(9));
	}
	@Test 
	public void testBigNumber(){
		assertEquals(list(5, 7, 7, 1327), Prime_Factors.getFactors(325115));
	}
	private ArrayList<Integer> list(int... i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (Integer n : i) {
			ret.add(n);
		}
		return ret;
	}
}
