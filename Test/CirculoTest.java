import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author Tony
 * @Version 2.1  
 * @Date 12 / 05 / 18  12:00h
 * 
 */


public class CirculoTest extends Circulo {
	private double radio;
	private double res;
	
	private CirculoTest circulin;

	public CirculoTest(double r, String tipoFigura) {
		super(r, tipoFigura);
		// TODO Auto-generated constructor de la clase 
		radio = r;		 
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void InicioPruebas() throws Exception {
		// la siguiente da error : 
	//	Circulo circulin = new Circulo(7, tipoFigura);
	//	assertNotNull(circulin);
	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void finPruebas()   {
		  //  circulin = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void InicioPruebasOrtizp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	
	@After
	public void FinPruebas()  {
		circulin = null;
	}

	
	/**
	 * Test method for {@link Circulo#area()}.
	 */
	@Test
	public final void testArea() {
		//Circulo circulin = new Circulo(7, tipoFigura) ;
		 double res = circulin.area() ;
		 assertEquals(  153,93 , res);
		 
		//	return radio * radio * PI;
		 
	}

	/**
	 * Test method for {@link Circulo#perimetro()}.
	 */
	@Test
	public final void testPerimetro() {	
		// Circulo circulin = new Circulo(7, tipoFigura) ;
		 double res = circulin.perimetro() ;
		 assertEquals(  43,98 , res);
	//	 assertEquals(  43,98 , circulin.getTipoFigura() );
		 
		//return radio * 2 * PI;		
		 
	}

	/**
	 * Test method for {@link Circulo#Circulo(double, java.lang.String)}.
	 */
	@Test
	public final void testCirculo() {
		fail("Not yet implemented"); // TODO
	}
	
	// el TEST  espera una Excepcion
	@Test(expected=java.lang.ArithmeticException.class)
	public void testAreaException() throws Exception   {
		Circulo circulin = new Circulo(0, tipoFigura) ;
		circulin.area();
		// double res = circulin.area();
	}
	
	
	@Test(expected=Exception.class)  // Prueba radio = " 0 "
	public void testRadio0() throws Exception   {
		Circulo circulin = new Circulo(0, tipoFigura) ;
		circulin.area();
		// double res = circulin.area();
	}

	@Test(expected=Exception.class)  // Prueba radio Negativo
	public void testRadioNegativo() throws Exception   {
		Circulo circulin = new Circulo(-3, tipoFigura) ;
		circulin.area();
		// double res = circulin.area();
	}


}











