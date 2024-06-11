package dtos;

public class Vehiculo {

	//Atributos
	long id;
	public Vehiculo(long id, String fechaMatriculacion, String matricula) {
		super();
		this.id = id;
		FechaMatriculacion = fechaMatriculacion;
		Matricula = matricula;
	}
	String FechaMatriculacion;
	String Matricula;
	
	
	
	//Getter y Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFechaMatriculacion() {
		return FechaMatriculacion;
	}
	public void setFechaMatriculacion(String fechaMatriculacion) {
		FechaMatriculacion = fechaMatriculacion;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	
	
}
