package oscurilandia;

import java.util.ArrayList;

public class Tablero {

	Carro lista_carros[]= new Carro[18];
	//ArrayList <Huevo> lista_huevos = new ArrayList<Huevo>();
	char matriz [][]= new char[15][15];
	
	public void crearCarro() {
		
		
		
		
		
		
	}
	
	public void lanzarHuevo() {
		
		
	}
	
	public void mostrarMatriz() {
		
		for (int i = 0; i < 15; i++) {
			System.out.print("|");
			for (int j = 0; j <15; j++) {
				
				System.out.print(matriz[i][j]+"|");
			
				
			}
			System.out.println("");
		}
		
	}
	
	public void calcularPuntaje() {
		
		
	}
	
	
}
