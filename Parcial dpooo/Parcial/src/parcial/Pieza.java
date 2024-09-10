package parcial;

public abstract class Pieza {

	protected int fila;
	
	protected int columna; 
	
	public Pieza(int Fila, int Columna) {
		this.fila = Fila;
		this.columna = Columna;
	}
	
	public abstract int CalcularCantidad(int fila, int columna);

}
