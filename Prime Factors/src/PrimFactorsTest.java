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
		assertEquals(new ArrayList<Integer>(), Prime_Factors.getFactors(1));
	}
}
