package com.entelgy.challenge.Animales.Modelos;

public class Vaca extends Animal{
	
	public Vaca(
				String nombre,
				String edad,
				String raza,
				String tiempo_de_vida
			) {
		super("Vaca", "Mugir");
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.tiempo_de_vida = tiempo_de_vida;
	}
	
}
