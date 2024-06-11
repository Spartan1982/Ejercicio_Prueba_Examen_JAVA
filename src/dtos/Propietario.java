package dtos;

public class Propietario {

	
	//Atributos
	long id;
	public Propietario(long id, String dni, String fechaCompra, String matricula) {
		super();
		this.id = id;
		Dni = dni;
		FechaCompra = fechaCompra;
		Matricula = matricula;
	}
	String Dni;
	String FechaCompra;
	String Matricula;
	
	//Getter y Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getFechaCompra() {
		return FechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		FechaCompra = fechaCompra;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	
}
