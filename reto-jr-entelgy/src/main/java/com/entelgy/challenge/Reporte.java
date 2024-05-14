package com.entelgy.challenge;

import java.util.NoSuchElementException;

import com.entelgy.challenge.Animales.Modelos.Animal;
import com.entelgy.challenge.Animales.Modelos.Gato;
import com.entelgy.challenge.Animales.Modelos.Perro;
import com.entelgy.challenge.Animales.Modelos.Vaca;

public class Reporte {
	
	private static Animal[] animales;
	
	public static void main(String[] args) {
		
		// Cargando los datos de los animales
		cargar_datos();
		
		// Comprobando que exista un argumento
		if(args.length <= 0) throw new IllegalArgumentException("Se debe proporcionar un nombre.");
		
		// Inicializando variables de búsqueda
		final String a_buscar = args[0];
		Animal encontrado = null;
		
		// Buscando al animal
		for(Animal animal : animales) {
			if(animal.getNombre().equalsIgnoreCase(a_buscar)) {
				encontrado = animal;
				break;
			}
		}
		
		// Comprobando que el animal se haya encontrado
		// (aclaración) NoSuchElementException extiende RuntimeException
		if(encontrado == null) throw new NoSuchElementException("Animal no encontrado."); 
		
		// Describiendo al animal encontrado
		System.out.println(encontrado.describir());
		
	}
	
	private static void cargar_datos() {
		animales = new Animal[] {
			new Perro("perro1", "2 años 3 meses", "raza1", "10 a 15"),
			new Perro("perro2", "1 año", "raza2", "12 a 14"),
			new Perro("perro3", "7 años 8 meses", "raza3", "17 a 20"),
			new Gato("gato1", "2 años", "raza4", "12 a 16"),
			new Gato("gato2", "3 años y 4 meses", "raza5", "13 a 17"),
			new Gato("gato3", "5 años y 2 meses", "raza6", "11 a 13"),
			new Vaca("vaca1", "4 meses", "raza7", "12 a 16"),
			new Vaca("vaca2", "4 años", "raza8", "10 a 16"),
			new Vaca("vaca3", "6 años 4 meses", "raza9", "13 a 18"),
		};
	}
	
}
