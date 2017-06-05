package prMinMax;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class MinMaxCiclomaticaTest {
	@Test
	public void statementCoverage_1_2_3_4_13(){
		int [] xs = null;
		int [] mm = MinMax.minMax(xs);
		assertEquals(null, mm);
	}

	
	@Test
	public void statementCoverage_8_9_12(){
		int [] xs = {};
		int [] mm = MinMax.minMax(xs);
		assertNull(mm);
	}

	@Test
	public void statementCoverage_8_10_11_12(){
		int [] xs = {1, 2};
		int [] mm = MinMax.minMax(xs);
		assertEquals(2, mm[1]);
	}
	
	@Test
	public void statementCoverage_8_10_12(){
		int [] xs = {2, 1};
		int [] mm = MinMax.minMax(xs);
		assertEquals(2, mm[1]);
	}
}
