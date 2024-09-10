package parcial;

public class Torre extends Pieza{
	
	int Cantidad = 4;
	
	public Torre(int fila, int columna) {
		super(fila, columna);
	
	}
	public int CalcularCantidad(int fila, int columna) {
		
		
		if (fila == 1 || fila == 8) {
			
			//Esquinas
			if (columna == 1 || columna == 8) { 
				
				Cantidad -= 2;
				
			// Lados
			} else {
				
				Cantidad -= 1;	
			}
		}
		
		//Otros lados
		else if (columna == 1 || columna == 8) {
			Cantidad -=1;
		}
		
		
		return Cantidad;
	}

}
