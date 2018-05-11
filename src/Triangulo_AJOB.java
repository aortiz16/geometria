
public class Triangulo_AJOB extends FiguraGeometrica_AJOB {
	private double Lado1;
	private double Lado2;
	private double Lado3;
	
	public Triangulo_AJOB(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		Lado1 = lado1;
		Lado2 = lado2;
		Lado3 = lado3;
	}

	@Override
	public double perimetro() {
		return Lado1 + Lado2 + Lado3;
	}

	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.perimetro() / 2;
		return Math.sqrt(sp * (sp-Lado1) * (sp-Lado2) * (sp-Lado3));
	}
}
