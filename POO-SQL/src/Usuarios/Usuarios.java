package Usuarios;

public class Usuarios {
	private String nombre;
	private String cuenta;
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", cuenta=" + cuenta + "]";
	}
	public Usuarios(String nombre, String cuenta) {
		super();
		this.nombre = nombre;
		this.cuenta = cuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
}
