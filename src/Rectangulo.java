/**
 *  @Author tony
 *  @Version 2.0 
 *  @Date  12 /05 /18  hours: 11:00h
 * 
 * Añadiendo comentarios
 */
	/*
		 * cada método de la clase explica qué acción realiza,
		 *
		 *	indica parámetros necesarios y el dato que devuelve
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
		 *   clase:  "RECTANGULO " con dos parámetros de entrada , que
		 *   
		 *   @param serán el lado1_largo y el lado2_corto del rectángulo
		 *   
		 *    método "AREA"   
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
		 *    @deprecated método: "perímetro"
		 *    @param SIN parámetros este método
		 *       
		 *    @return Dato que devuelve  un Nº decimal:
		 *
		 *    @return  que es el resultado de sumar todos sus lados
		 *     
		 *      ( lado1 x 2 ) + ( lado2 + lado2 ) 
		 * 
		 */
		
		return (2 * l1) + (2 * l2);
		
	}

}
