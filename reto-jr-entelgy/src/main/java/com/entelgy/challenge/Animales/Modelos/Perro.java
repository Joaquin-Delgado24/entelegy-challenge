package com.entelgy.challenge.Animales.Modelos;

public class Perro extends Animal{

	public Perro(
				String nombre,
				String edad,
				String raza,
				String tiempo_de_vida
			) {
		super("Perro", "Ladrar");
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.tiempo_de_vida = tiempo_de_vida;
	}
	
}
