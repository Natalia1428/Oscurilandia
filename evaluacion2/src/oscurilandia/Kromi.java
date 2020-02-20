package oscurilandia;

public class Kromi extends Carro {

	private String aniofabricacion;
	private String marca;
	
	public Kromi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Kromi(int cantidad_ocupantes, String fecha_ingreso, int posicion_x, int posicion_y, String aniofabricacion, String marca) {
		super(cantidad_ocupantes, fecha_ingreso, posicion_x, posicion_y);
		// TODO Auto-generated constructor stub
		
		this.aniofabricacion = aniofabricacion;
		this.marca = marca;
		
	}

	
	public String getAniofabricacion() {
		return aniofabricacion;
	}

	public void setAniofabricacion(String aniofabricacion) {
		this.aniofabricacion = aniofabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi" + super.toString() + "[aniofabricacion=" + aniofabricacion + ", marca=" + marca + "]";
	}
	
	
	
	
}
