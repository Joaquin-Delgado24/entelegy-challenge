package com.entelgy.challenge.Animales.Modelos;

public class Gato extends Animal{
	
	public Gato(
				String nombre,
				String edad,
				String raza,
				String tiempo_de_vida
			) {
		super("Gato", "Maullar");
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.tiempo_de_vida = tiempo_de_vida;
	}
	
}
