package org.agomez.RegistroPorPasos.model;

import java.util.List;

public class DatosPersonales {

	private String nombre;
	
	private String apellido;
	
	private String nacimiento;
	
	private String genero;
	
	private String estado;
	
	private String hijos;
	
	private List<String> nacionalidades;


	/**
	 * 
	 */
	public DatosPersonales() {
		super();
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param nacimiento
	 * @param genero
	 * @param estado
	 * @param hijos
	 * @param nacionalidades
	 */
	public DatosPersonales(String nombre, String apellido, String nacimiento, String genero, String estado,
			String hijos, List<String> nacionalidades) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.genero = genero;
		this.estado = estado;
		this.hijos = hijos;
		this.nacionalidades = nacionalidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getHijos() {
		return hijos;
	}

	public void setHijos(String hijos) {
		this.hijos = hijos;
	}

	public List<String> getNacionalidades() {
		return nacionalidades;
	}

	public void setNacionalidades(List<String> nacionalidades) {
		this.nacionalidades = nacionalidades;
	}
	
	
}
