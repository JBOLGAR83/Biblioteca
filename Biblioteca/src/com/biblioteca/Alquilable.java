package com.biblioteca;

public interface Alquilable {
	void alquilar();
	
	default void descripcion () {
		System.out.println("Describiendo el objeto");
	}
}
