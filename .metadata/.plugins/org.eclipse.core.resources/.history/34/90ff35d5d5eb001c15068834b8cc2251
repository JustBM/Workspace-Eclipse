//Especialización de la superclase: con Extends heredamos los atributos de la class vehiculo
public class Coche extends vehiculo {
	private float caballos; 
	
	public coche () {
		super(0.0f, 4, 0);
		this.caballos=0.0f;
	}
	public Coche(float velocidad, float caballos, int asientos, int orientacionRuedas) {
		super (velocidad , asientos , orientacionRuedas)
		this.caballos=caballos;
	}
//private float velocidad;
private float caballos;
//private float asientos;
//private float orientacionRuedas;
public static float factorConversionCvKw=1.35f;

//estamos heredando estas anteriores ni posteriores, por lo que no son necesarias ya.

//public void parar () {}
//public void acelerar () {}
//public void desacelerar () {}
//public void girarIzquierda () {}
//public void girarDerecha () {}


//metodo static que convierte los cv a kw
	public static float convertirCvKw(float caballos) {
		return caballos / 1.35f; 
	}
	//metodo static que convierte los kw a cv
	public static float convertirKwCv(float kilowatio) {
		return kilowatios *1.35f;
	}
	
}

