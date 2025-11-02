package uni1a;

public class Investigador {
	private String nombre;
	private String especialidad;
	private int exp;
	
	public Investigador(String nombre, String especialidad , int exp){
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.exp = exp;
		
 }
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	
}

