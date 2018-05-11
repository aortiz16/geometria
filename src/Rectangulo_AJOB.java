/*
 *  clase Rectangulo. Indicando: el autor, tu nombre y apellidos, la versi�n; 1.1,
 *   adem�s para cada m�todo de la clase explica qu� acci�n realiza, 
 *   e indica los par�metros necesarios y el dato que devuelve (en caso de no ser void).
 * @Author TONY ORTIZ
 * @Version 1.1  
 */
public class Rectangulo_AJOB extends FiguraGeometrica_AJOB {
	private double l1;
	private double l2;
	
	public Rectangulo_AJOB(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * la clase RECTANGULO CONTIENE DOS M�TODOS
	 * en el m�todo llamado "area" se calcula la superficie del rect�ngulo
	 * multiplicando lado1 x lado2
	 */
	
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 *   en el m�todo llamado "perimetro" se calcula la longitud de todos sus lados
	 * sumando  (lado1 x 2 ) + lado2 + lado2
	 */

	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
