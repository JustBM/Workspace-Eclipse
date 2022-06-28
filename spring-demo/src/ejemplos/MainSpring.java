package ejemplos;

public class MainSpring {

	public static void main(String[] args) {
		Entrenador entrenadorFutbol = new entrenadorFutbol();
		Entrenador entrenadorBaloncesto = new entrenadorBaloncesto();
		System.out.println(entrenadorFutbol.getEntrenamiento());
		System.out.println(entrenadorBaloncesto.getEntrenamiento());
	}

}
