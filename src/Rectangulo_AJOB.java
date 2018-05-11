/*
 *  clase Rectangulo. Indicando: el autor, tu nombre y apellidos, la versión; 1.1,
 *   además para cada método de la clase explica qué acción realiza, 
 *   e indica los parámetros necesarios y el dato que devuelve (en caso de no ser void).
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
	 * la clase RECTANGULO CONTIENE DOS MÉTODOS
	 * en el método llamado "area" se calcula la superficie del rectángulo
	 * multiplicando lado1 x lado2
	 */
	
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 *   en el método llamado "perimetro" se calcula la longitud de todos sus lados
	 * sumando  (lado1 x 2 ) + lado2 + lado2
	 */

	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
