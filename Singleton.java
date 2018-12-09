package com.MICHZM.game;

public class Singleton {
	 
	private static Singleton Sin;
	Singleton() {
		
	}
	public static Singleton getInstance() {
		
		if(Sin==null) {
			Sin = new Singleton();
		}
		
		return Sin;
	}
	
	public void Estupido() {
		System.out.println("¡GAME OVER!");
	}
	public void Ending() {
		System.out.println("Has sufido durante todo el trimestre pero ya no tienes que pasar por ello."
				+ "\nSeras feliz C:");
		System.out.println("¡Has ganado!");
		System.out.println("Fin");
	}

}
