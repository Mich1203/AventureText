package com.MICHZM.game;

public class EntendiendoClase implements Interumpir{
	
	@SuppressWarnings("unused")
	private String funcion;
	
	public EntendiendoClase(String pelear){
		funcion = pelear;
	} 

	@Override
	public void Bachillerato() {
		// TODO Auto-generated method stub
		System.out.println("Machado: Aqui no se viene a jugar palo como en el bachillerato");
	}

	@Override
	public void Tecnologia() {
		// TODO Auto-generated method stub
		System.out.println("Machado: Muchachos hay que darle un buen uso a eso aparatos");
	}

	@Override
	public void Cheo() {
		// TODO Auto-generated method stub
		System.out.println("Machado: Es que Cheo y yo estabamos de agregar mas horas en las matematicas");
	}

}
