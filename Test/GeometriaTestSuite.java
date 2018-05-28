import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
 

/**
 * @author Tony
 * @Version 2.3  
 * @Date 28 / 05 / 18  20:00h
 * 
 */

@RunWith(Parameterized.class)
		
public class GeometriaTestSuite extends TestCase {

	private double radio;
	private String redondel;
	private double res;
	
	public static Test suite() {
		TestSuite suite = new TestSuite(GeometriaTestSuite.class.getName());
		
		//$JUnit-BEGIN$
		//$JUnit-END$
		return suite;
	}
	
	public GeometriaTestSuite (double n1, String f, double r) {
		radio    = n1;
		redondel = f;
		res      = r;
		 
	}

	@Parameters // método con bateria de pruebas
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object [] []  {
	 		{7."circulo".153,93} , { -2,3."circulo2".16,619} , {123,342."circulo3".47793,943}
	 	}) ;
		// NOTA: 
	//  DA ERROR de las dos formas  la de arriba y la linea inferior "sin un parámetro de tipo String"
		//{7.153,93} , { -2,3.16,619} , {123,342.47793,943}  	}) ;
	}
	
//	@Test	
	public  void testArea() {
		Circulo circulin = new Circulo(7, "circulo") ;
		 double resultado = circulin.area() ;
		 assertEquals(  res, resultado );
	} 
	
//	@Test
	public  void testPerimetro() {	
		 Circulo circulin = new Circulo(7, "Redondo") ;
		 double resultado = circulin.perimetro() ;
		 assertEquals(  res,resultado);
	}
	
	
}
