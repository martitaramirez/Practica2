package prMinMax;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;



public class MinMaxCajaNegraTest {
	
	int[] vector;
	
	@Before
	public void inicializar(){
		vector = new int[10];
	}
	
	@Test
	public void testVectorVacio() {
		int [] xs = {};
		MinMax.minMax(xs);
		assertEquals(0, xs.length);
	}
	
	
	@Test
	public void testVectorFuncionaBien() {
		int [] vectorActual = {0,8};
		int [] vectorEsperado = {0,8};
		MinMax.minMax(vectorActual);
		assertArrayEquals(vectorEsperado, vectorActual);
	}
	
	
	@Test
	public void testVectorFuncionaFatal() {
		int [] vectorActual = {2,1,0,8,7};
		int [] vectorEsperado = {0,8};
		MinMax.minMax(vectorActual);
		assertFalse(Arrays.equals(vectorEsperado, vectorActual));
	}
	
	
	@Test
	public void testVectorNulo() {
		int [] vectorActual = null;
		int [] vectorEsperado = null;
		assertArrayEquals(vectorEsperado, vectorActual);

		}
	}
	
	/*No se me han ocurrido más pruebas, creo que con esas cubre todas
	 * las posibles opciones. Que este principalmente vacio, que sea nulo, 
	 * que funcione, o que no funcione como esperabamos.
	 * 
	 * He hecho la distincion de vacio y nulo porque puede que contenga datos
	 * pero que no sean los que nos pide el ejercicio. 
	 */
	
	
	
	
	

