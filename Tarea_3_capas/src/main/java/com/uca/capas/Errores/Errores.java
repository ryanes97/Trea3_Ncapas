package com.uca.capas.Errores;

public class Errores {
	public String enombre;
	public String eapellido;
	public String efechaNac;
	public String elugarNac;
	public String ecolegio;
	public String efijo;
	public String emovil;
	
	public String getNombre(){
		return enombre;
	}
	
	public void setNombre(String nombre) {
		this.enombre = nombre;
	}
	
	public String getApellido(){
		return eapellido;
	}
	
	public void setApellido(String apellido) {
		this.eapellido = apellido;
	}
	
	public String getFechaNac(){
		return efechaNac;
	}
	
	public void setFechaNac(String fechaNac ) {
		efechaNac = fechaNac;
	}
	
	public String getLugarNac(){
		return elugarNac;
	}
	
	public void setLugarNac(String lugarNac) {
		this.elugarNac = lugarNac;
	}
	
	public String getColegio(){
		return ecolegio;
	}
	
	public void setColegio(String colegio ) {
		this.ecolegio = colegio;
	}
	
	public String getFijo(){
		return efijo;
	}
	
	public void setFijo(String fijo ) {
		this.efijo = fijo;
	}
	
	public String getMovil(){
		return emovil;
	}
	
	public void setMovil(String movil ) {
		this.emovil = movil;
	}
}
