package org.agomez.RegistroPorPasos.model;

/**
 * @author alumno
 *
 */
public class DatosProfesionales {

	private String departamento;
	
	private String salario;
	
	private String comentario;

	public DatosProfesionales() {
		
	}



	public DatosProfesionales(String departamento, String salario, String comentario) {
		super();
		this.departamento = departamento;
		this.salario = salario;
		this.comentario = comentario;
	}



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	public String getSalario() {
		return salario;
	}



	public void setSalario(String salario) {
		this.salario = salario;
	}



	public String getComentario() {
		return comentario;
	}



	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
}
