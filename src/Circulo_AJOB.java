/*
 *  A�ade una sentencia condicional al c�digo del m�todo constructor de la clase Circulo,
 *  
 *   SI par�metro_radio ES negativo     -->        lo convierta a positivo.
 *   
 */
public class Circulo_AJOB extends FiguraGeometrica_AJOB {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_AJOB(double r, String tipoFigura) {
		super(tipoFigura);
		if ( r < 0  ) {  r = r * -1 ; }
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
