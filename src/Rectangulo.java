/**
 *  @Author tony
 *  @Version 2.0 
 *  @Date  12 /05 /18  hours: 11:00h
 * 
 * A�adiendo comentarios
 */
	/*
		 * cada m�todo de la clase explica qu� acci�n realiza,
		 *
		 *	indica par�metros necesarios y el dato que devuelve
		 * 
	 */

public class Rectangulo extends FiguraGeometrica {
	private double l1;
	private double l2;
	
	public Rectangulo(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
		
		
		/*
		 *   clase:  "RECTANGULO " con dos par�metros de entrada , que
		 *   
		 *   @param ser�n el lado1_largo y el lado2_corto del rect�ngulo
		 *   
		 *    m�todo "AREA"   
		 *	@return Dato que devuelve : es el resultado de multiplicar lado1 x lado2 
		 * 
		 */
		
	}

	
	@Override
	public double area() {
		return l1 * l2;
	}
	
	@Override
	public double perimetro() {
		
		/*                             
		 *   
		 *    @deprecated m�todo: "per�metro"
		 *    @param SIN par�metros este m�todo
		 *       
		 *    @return Dato que devuelve  un N� decimal:
		 *
		 *    @return  que es el resultado de sumar todos sus lados
		 *     
		 *      ( lado1 x 2 ) + ( lado2 + lado2 ) 
		 * 
		 */
		
		return (2 * l1) + (2 * l2);
		
	}

}
