	public class avion extends vehiculo {

//atributos			
		private boolean trenDeAterrizaje;		
		
		public avion(float trenDeAterrizaje) {
			super(velocidad, asientos, orientacionRuedas);
			this.trenDeAterrizaje;

			public avion () {
				super(0.0f, 4, 0);
				this.trenAterrizaje=true;
			}
			public Coche(float velocidad, int asientos, int orientacionRuedas, boolean trenAterrizaje) {
				super (velocidad , asientos , orientacionRuedas)
				this.trenAterrizaje=trenAterrizaje;
			}
			

//metodos
	public void volar () {}
	public void aterrizar () {}


}