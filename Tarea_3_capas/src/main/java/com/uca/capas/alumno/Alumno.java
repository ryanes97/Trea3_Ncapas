package com.uca.capas.alumno;

public class Alumno {
	private String nombre;
	private String apellido;
	private String fechaNac;
	private String lugarNac;
	private String colegio;
	private String fijo;
	private String movil;
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getFechaNac(){
		return fechaNac;
	}
	
	public void setFechaNac(String fechaNac ) {
		this.fechaNac = fechaNac;
	}
	
	public String getLugarNac(){
		return lugarNac;
	}
	
	public void setLugarNac(String lugarNac) {
		this.lugarNac = lugarNac;
	}
	
	public String getColegio(){
		return colegio;
	}
	
	public void setColegio(String colegio ) {
		this.colegio = colegio;
	}
	
	public String getFijo(){
		return fijo;
	}
	
	public void setFijo(String fijo ) {
		this.fijo = fijo;
	}
	
	public String getMovil(){
		return movil;
	}
	
	public void setMovil(String movil ) {
		this.movil = movil;
	}
}
