package parcial;

public class Rey extends Pieza{

int Cantidad = 8;
	
	public Rey(int fila, int columna) {
		super(fila, columna);
	
	}
	public int CalcularCantidad(int fila, int columna) {
		
		
		if (fila == 1 || fila == 8) {
			
			//Esquinas
			if (columna == 1 || columna == 8) { 
				
				Cantidad -= 5;
				
			// Lados
			} else {
				
				Cantidad -= 3;	
			}
		}
		
		//Otros lados
		else if (columna == 1 || columna == 8) {
			Cantidad -=3;
		}
		
		
		return Cantidad;
	}

}


