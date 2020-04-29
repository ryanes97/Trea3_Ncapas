package com.uca.capas.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uca.capas.Errores.Errores;
import com.uca.capas.alumno.Alumno;

@Controller
public class MainController {
	
	@GetMapping("/ingresar")
	public String enviarFrom(Alumno alumno) {
		return "agregarAlumno";
	}
	
	@RequestMapping("/ingresar")
	public String procesarFrom(Alumno alumno, Errores errores) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaLimite = sdf.parse("2003-01-01");
		
		
		if(alumno.getNombre().length() < 1 || alumno.getNombre().length() > 25) {
			
			errores.setNombre("El nombre debe tener menos de 25 caracteres y mas de 1 caracter");
			
		}else {
			errores.setNombre("Correcto");
		}
		if(alumno.getApellido().length() < 1 || alumno.getApellido().length() > 25){
			errores.setApellido("El apellido debe tener menos de 25 caracteres y mas de 1 caracter");
		}else {
			errores.setApellido("Correcto");
		}
		
		if(!alumno.getFechaNac().isEmpty()) {
			Date fechaIngresada = sdf.parse(alumno.getFechaNac());
			if(fechaIngresada.compareTo(fechaLimite) < 0){
				errores.setFechaNac("La fecha de nacimiento no puede ser menor a 01-01-2003");
			}else {
				errores.setFechaNac("Correcto");}
		}else {
			errores.setFechaNac("El campo de fecha esta vacio");
		}
		
		
		if(alumno.getLugarNac().length() < 1 || alumno.getLugarNac().length() > 25){
			errores.setLugarNac("El lugar de nacimiento debe tener menos de 25 caracteres y mas 1 un caracter");
		}else {
			errores.setLugarNac("Correcto");
		}
		if(alumno.getColegio().length() < 1 || alumno.getColegio().length() > 100){
			errores.setColegio("El colegio o instituto debe tener menos de 100 caracteres y mas de 1 caracter");
		}else {
			errores.setColegio("Correcto");
		}
		if(alumno.getFijo().length() != 8){
			errores.setFijo("El telefono fijo debe tener exactamente 8 numeros");
		}else {
			errores.setFijo("Correcto");
		}
		if(alumno.getMovil().length() !=8){
			errores.setMovil("El telefono movil debe de tener exactamente 8 numeros");
		}else {
			errores.setMovil("Correcto");
		}
		
		if(errores.getNombre()=="Correcto" && errores.getApellido()=="Correcto" && errores.getColegio()=="Correcto" && errores.getFechaNac()=="Correcto" && errores.getLugarNac()=="Correcto" && errores.getFijo()=="Correcto" && errores.getMovil()=="Correcto") {
			//System.out.print("hola11");
			return "mostrarMensajeCorrecto";
			
		}else {
			System.out.print(alumno.getFechaNac());
			return "mostrarValidacion";

		}
		
	}
}
