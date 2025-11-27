package com.biblioteca;

public class Libro implements Alquilable {
	private String titulo;

	public Libro(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public void alquilar() {
		System.out.println("Alquilando libro: " + titulo);
	}
}
