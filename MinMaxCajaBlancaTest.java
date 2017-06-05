package prMinMax;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxCajaBlancaTest {

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

	@Test
	public void decisionCoverage_1(){
		int [] xs = {5,8,1,3,4};
		int [] mm = MinMax.minMax(xs);
		assertEquals(8, mm[1]);
		assertEquals(1, mm[0]);
	}
	
	@Test
	public void decisionCoverage_2(){
		int [] xs = {};
		int [] mm = MinMax.minMax(xs);
		assertEquals(null, mm);
	}

	@Test
	public void conditionCoverage(){
		//	public void statementCoverage_8_9_12
	}

	@Test
	public void decisionConditionCoverage(){
		/*	public void decisionCoverage_1()
		 * 	public void decisionCoverage_2(){
		 * 	public void conditionCoverage(){
		 */

	}

}
