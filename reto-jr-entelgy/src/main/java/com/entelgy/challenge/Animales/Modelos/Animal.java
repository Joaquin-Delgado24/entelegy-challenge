package com.entelgy.challenge.Animales.Modelos;

import com.entelgy.challenge.Animales.HaceSonido;

public abstract class Animal implements HaceSonido {

	public String nombre;
	public String edad;
	public String raza;
	public String tiempo_de_vida;
	public final String sonido;
	public final String tipo;
	
	public Animal(String tipo, String sonido) {
		this.tipo = tipo;
		this.sonido = sonido;
	}
	
	public final String describir() {
		return String.format("%s es un %s de raza %s que tiene %s de edad. "
				+ "Siempre %s cuando está feliz. Su expectativa de vida "
				+ "es de %s años", nombre, tipo, raza, edad, sonido, tiempo_de_vida);
	}
	
	@Override
	public void realizar_sonido() {
		System.out.println(sonido);
	}

	
	// Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTiempo_de_vida() {
		return tiempo_de_vida;
	}

	public void setTiempo_de_vida(String tiempo_de_vida) {
		this.tiempo_de_vida = tiempo_de_vida;
	}

	public String getTipo() {
		return tipo;
	}
}
